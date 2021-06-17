/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import com.emcef.model.MachinesInstallees;
import com.emcef.model.TaxeGroupes;
import com.emcef.model.User;
import com.emcef.request.ClientDto;
import com.emcef.request.FactureRequest;
import com.emcef.request.ItemDto;
import com.emcef.request.OperatorDto;
import com.emcef.request.PaymentDto;
import com.emcef.response.FactureResponse;
import com.emcef.response.FinalFactureResponse;
import com.emcef.service.FactureService;
import com.emcef.service.LigneDeFactureService;
import com.emcef.service.MachineService;
import com.emcef.service.UserService;
import com.emcef.service.RapportService;
import com.emcef.service.TaxesService;
import com.emcef.utility.JWTUtility;
import com.emcef.utility.JwtRequest;
import com.emcef.utility.JwtResponse;
import org.json.simple.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class FactureResController {

    @Autowired
    FactureService factureService;

    @Autowired
    TaxesService taxesService;

    @Autowired
    UserService userService;

    @Autowired
    RapportService rapportService;

    @Autowired
    MachineService machineService;
    
    @Autowired
    LigneDeFactureService ligneDeFactureService;

    @Autowired
    private JWTUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    String getAlphaNumericString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

    String numero(int valeur) {
        String val = Integer.toString(valeur);
        String padded = "";
        if (val.length() == 0) {
            padded = String.format("%05d", 1);
        }
        if (val.length() == 1) {
            padded = String.format("%05d", valeur);
        }
        if (val.length() == 2) {
            padded = String.format("%04d", valeur);
        }
        if (val.length() == 3) {
            padded = String.format("%03d", valeur);
        }
        if (val.length() == 4) {
            padded = String.format("%02d", valeur);
        }
        if (val.length() == 5) {
            padded = String.format("%01d", valeur);
        }
        if (val.length() == 6) {
            padded = val;
        }
        return padded;
    }

    public String transform(int valeur) {
        String val = "" + valeur;
        if (valeur < 10) {
            val = "0" + valeur;
        }
        return val;
    }

    String getParticularString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

    @GetMapping("/invoice/{uid}")
    public FactureRequest detailsFacture(@PathVariable(value = "uid") String uid) {
        int id = factureService.uidId(uid);
        FactureRequest response = new FactureRequest();
        OperatorDto operator = new OperatorDto();
        ClientDto client = new ClientDto();

        operator.setId((String) factureService.UidInfo(uid).get("operateur_id"));
        operator.setName((String) factureService.UidInfo(uid).get("operateur"));
        client.setAddress((String) factureService.UidInfo(uid).get("adresse1_client"));
        client.setContact((String) factureService.UidInfo(uid).get("contact1_client"));
        client.setIfu((String) factureService.UidInfo(uid).get("ifu_client"));
        client.setName((String) factureService.UidInfo(uid).get("nom_client"));

        List<PaymentDto> payment = new ArrayList<>();
        List<ItemDto> items = new ArrayList<>();

        factureService.Item(id).stream().map((plus) -> {
            ItemDto donnee = new ItemDto();
            donnee.setCode((String) plus.get("code"));
            donnee.setName((String) plus.get("name"));
            donnee.setPrice((double) plus.get("price"));
            donnee.setQuantity((double) plus.get("quantity"));
            donnee.setTaxGroup((String) plus.get("taxratelabel"));
            return donnee;
        }).forEachOrdered((donnee) -> {
            items.add(donnee);
        });

        factureService.Payement(uid).stream().map((plus) -> {
            PaymentDto donnee = new PaymentDto();
            donnee.setName((String) plus.get("name"));
            donnee.setAmount((Long) plus.get("amount"));
            return donnee;
        }).forEachOrdered((donnee) -> {
            payment.add(donnee);
        });

        response.setIfu((String) factureService.UidInfo(uid).get("ifu"));
        response.setClient(client);
        response.setItems(items);
        response.setOperator(operator);
        response.setPayment(payment);
        response.setType((String) factureService.UidInfo(uid).get("type"));

        return response;
    }

    @PostMapping("/invoice/{uid}/{action}")
    public FinalFactureResponse finaliser(@PathVariable(value = "uid") String uid, @PathVariable(value = "action") String action, HttpServletRequest httpServletRequest) throws Exception {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;

        if (null != authorization && authorization.startsWith("Bearer ")) {
            token = authorization.substring(7);
            userName = jwtUtility.getUsernameFromToken(token);
        }

        FinalFactureResponse finalFactureResponse = new FinalFactureResponse();

        if ("confirm".equals(action)) {
            int id = 0;
            Date date = factureService.getDate(uid);
            String code = "", qrcode = "", datetime = "", counters = "", nim = "";
            String code1 = "", code2 = "", code3 = "", code4 = "", code5 = "", code6 = "";
            int pending = factureService.pendingFacture();
            factureService.confirmFacture(uid);
            int validated = factureService.validatedFacture();
            counters = validated + "/" + pending + "FV";
            id = factureService.getId(uid);
            code1 = getParticularString(4);
            code2 = getParticularString(4);
            code3 = getParticularString(4);
            code4 = getParticularString(4);
            code5 = getParticularString(4);
            code6 = getParticularString(4);
            code = code1 + "-" + code2 + "-" + code3 + "-" + code4 + "-" + code5 + "-" + code6;
            datetime = transform(date.getDate()) + "/" + transform(date.getMonth() + 1) + "/" + transform(date.getYear() + 1900) + " " + transform(date.getHours()) + ":" + transform(date.getMinutes()) + ":" + transform(date.getSeconds());
            nim = factureService.getNim(uid);
            qrcode = "F;" + nim + ";" + code1 + code2 + code3 + code4 + code5 + code6 + ";" + userService.getUser(userName).getIfu() + ";" + transform(date.getYear() + 1900) + transform(date.getMonth() + 1) + transform(date.getDate()) + transform(date.getHours()) + transform(date.getMinutes()) + transform(date.getSeconds());
            factureService.setFactureNormalisee(code, counters, datetime, nim, qrcode, id);
            finalFactureResponse.setCodeMECeFDGI(code);
            finalFactureResponse.setCounters(counters);
            finalFactureResponse.setDateTime(datetime);
            finalFactureResponse.setNim(nim);
            finalFactureResponse.setQrCode(qrcode);
        }

        if ("cancel".equals(action)) {
            Date date = factureService.getDate(uid);
            String datetime = date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
            finalFactureResponse.setDateTime(datetime);
        }
        return finalFactureResponse;
    }

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Le nom d'utilisateur et le mot de passe sont invalides.");
        }
        JwtResponse reponse = new JwtResponse();
        final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());

        if (!userDetails.getUsername().equals(jwtRequest.getUsername())) {
            reponse.setStatus("NO");
            return reponse;
        } else {
            final String token = jwtUtility.generateToken(userDetails);
            reponse.setJwtToken(token);
            reponse.setStatus("YES");
            return reponse;
        }

    }

    @PostMapping("/invoice")
    public FactureResponse factureDemande(@RequestBody FactureRequest factureRequest, HttpServletRequest httpServletRequest) throws Exception {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;

        if (null != authorization && authorization.startsWith("Bearer ")) {
            token = authorization.substring(7);
            userName = jwtUtility.getUsernameFromToken(token);
        }

        double taa = 0, tab = 0, tac = 0, tad = 0, tae = 0, taf = 0, total = 0;
        FactureSelonSpecification facture = new FactureSelonSpecification();
        //FactureNormalisee normale = null;
        User user = userService.getUser(userName);
        MachinesInstallees machine = machineService.findAllByIfu(user.getIfu());
        TaxeGroupes tax = taxesService.findAllById(1L);
        int tax_a = tax.getA(), tax_b = tax.getB(), tax_c = tax.getC(), tax_d = tax.getD(), tax_e = tax.getE(), tax_f = tax.getF();
        Date maintenant = new Date();
        String uid = getAlphaNumericString(8) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(12);
        int position = factureService.tout().size() + 1;
        int taxe = 0;

        for (ItemDto str : factureRequest.getItems()) {
            if ("A".equalsIgnoreCase(str.getTaxGroup())) {
                taa = taa + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
            if ("B".equalsIgnoreCase(str.getTaxGroup())) {
                tab = tab + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
            if ("C".equalsIgnoreCase(str.getTaxGroup())) {
                tac = tac + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
            if ("D".equalsIgnoreCase(str.getTaxGroup())) {
                tad = tad + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
            if ("E".equalsIgnoreCase(str.getTaxGroup())) {
                tae = tae + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
            if ("F".equalsIgnoreCase(str.getTaxGroup())) {
                taf = taf + str.getPrice() * str.getQuantity();
                total = total + str.getPrice() * str.getQuantity();
            }
        }

        String methode = "";
        Long montant = 0L;

        for (PaymentDto pay : factureRequest.getPayment()) {
            montant = pay.getAmount();
            methode = pay.getName();
        }

        facture.setAdresse1(machine.getId_installation().getAdresse());
        facture.setAdresse1_client(factureRequest.getClient().getAddress());
        facture.setAdresse2(machine.getId_installation().getAdresse1());
        facture.setAdresse2_client(userName);
        facture.setAdresse3(machine.getId_installation().getEmail());
        facture.setAib(0);
        facture.setCalcul(true);
        facture.setCompteur_schema_controleur(0);
        facture.setCompteur_total_controuleur(0);
        facture.setContact1(machine.getId_installation().getTelephone());
        facture.setContact1_client(factureRequest.getClient().getContact());
        facture.setContact2(machine.getId_installation().getContact_personnel());
        facture.setContact2_client("");
        facture.setControle_identifaction("");
        facture.setDateTime(maintenant);
        facture.setDate_controleur(maintenant);
        facture.setDate_heure_controleur(maintenant);
        facture.setDate_requette(maintenant);
        facture.setDonneecontrole_controleur("");
        //facture.setFactureNormalisee(normale);
       // facture.setId(position);
        facture.setId_document(numero(factureService.getAllFactureSelonSpecification().size()));
        facture.setId_fichier(0);
        facture.setIfu_client(factureRequest.getClient().getIfu());
        facture.setIfuseller(factureRequest.getIfu());
        facture.setInfo_date(maintenant);
        facture.setMethode(methode);
        facture.setMontant_aib(0);
        facture.setMontant_payement(0);
        facture.setNim(machineService.findAllByIfu(user.getIfu()).getNim());
        facture.setNom_client(factureRequest.getClient().getName());
        facture.setNom_commercial(methode);
        facture.setNumero_execution(0);
        facture.setOperateur(factureRequest.getOperator().getName());
        facture.setOperateur_id(factureRequest.getOperator().getId());
        facture.setPayed(montant);
        facture.setPayement("");
        facture.setStatus(Boolean.FALSE);
        facture.setTaux_tax_a(tax_a);
        facture.setTaux_tax_b(tax_b);
        facture.setTaux_tax_c(tax_c);
        facture.setTaux_tax_d(tax_d);
        facture.setTauxtax_e(tax_e);
        facture.setTauxtax_f(tax_f);
        facture.setTax_specifique_a(0);
        facture.setTax_specifique_b(0);
        facture.setTax_specifique_c(0);
        facture.setTax_specifique_d(0);
        facture.setTax_specifique_e(0);
        facture.setTax_specifique_f(0);
        facture.setTaxable_a(taa - (taa * (tax_a * 0.01)));
        facture.setTaxable_b(tab - (tab * (tax_b * 0.01)));
        facture.setTaxable_c(tac - (tac * (tax_c * 0.01)));
        facture.setTaxable_d(tad - (tad * (tax_d * 0.01)));
        facture.setTaxable_e(tae - (tae * (tax_e * 0.01)));
        facture.setTaxable_f(taf - (taf * (tax_f * 0.01)));
        facture.setTotal(total);
        facture.setTotal_a(taa);
        facture.setTotal_b(tab);
        facture.setTotal_c(tac);
        facture.setTotal_d(tad);
        facture.setTotal_e(tae);
        facture.setTotal_f(taf);
        facture.setTotal_tax(0);
        facture.setTotal_tax_a(taa * (tax_a * 0.01));
        facture.setTotal_tax_b(tab * (tax_b * 0.01));
        facture.setTotal_tax_c(tac * (tax_c * 0.01));
        facture.setTotal_tax_d(tad * (tax_d * 0.01));
        facture.setTotal_tax_e(tae * (tax_e * 0.01));
        facture.setTotal_tax_f(taf * (tax_f * 0.01));
        facture.setTotal_tax_specifique(0);
        facture.setTotal_taxable(0);
        facture.setType(factureRequest.getType());
        facture.setType_machine(methode);
        facture.setUid(uid);

        factureService.saveFacture(facture);

        String group = "";
        for (ItemDto str : factureRequest.getItems()) {

            if ("A".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getA();
                group = "A";
            }
            if ("B".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getB();
                group = "B";
            }
            if ("C".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getC();
                group = "C";
            }
            if ("D".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getD();
                group = "D";
            }
            if ("E".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getE();
                group = "E";
            }
            if ("F".equalsIgnoreCase(str.getTaxGroup())) {
                taxe = tax.getF();
                group = "F";
            }
            double mont = str.getPrice() * str.getQuantity();
            double ht = mont - (mont * (taxe / 100));
            LigneDeFacture article = new LigneDeFacture();
            article.setAmount(mont);
            article.setAmounttaxable(ht);
            article.setCode(str.getCode());
            article.setFacture(facture);
            article.setId(position);
            article.setIslabel(true);
            article.setIsts(false);
            article.setModifiername(userName);
            article.setModifiervalue(userName);
            article.setName(str.getName());
            article.setOrdinalnumber(taxe);
            article.setOriginalprice(str.getPrice());
            article.setPrice(str.getPrice());
            article.setPricetaxable(str.getPrice() * (taxe / 100));
            article.setQuantity(str.getQuantity());
            article.setTax(taxe);
            article.setTaxamount(mont * (taxe / 100));
            article.setTaxrate(0);
            article.setTaxratelabel(group);
            article.setTsamount(0);
            article.setTsamounttaxable(0);
            article.setTsprice(0);
            article.setTspricetaxable(0);
            article.setTstax(0);
            article.setTstaxamount(0);
            ligneDeFactureService.saveArticle(article);
        }

        FactureResponse last = new FactureResponse();
        last.setUid(uid);
        last.setTa(facture.getTaux_tax_a());
        last.setTb(facture.getTaux_tax_b());
        last.setTc(facture.getTaux_tax_c());
        last.setTd(facture.getTaux_tax_d());
        last.setTc(facture.getTauxtax_e());
        last.setTd(facture.getTauxtax_f());
        last.setTaa(facture.getTotal_a());
        last.setTab(facture.getTotal_b());
        last.setTac(facture.getTotal_c());
        last.setTad(facture.getTotal_d());
        last.setTae(facture.getTotal_e());
        last.setTaf(facture.getTotal_f());
        last.setHaa(facture.getTaxable_a());
        last.setHab(facture.getTaxable_b());
        last.setHac(facture.getTaxable_c());
        last.setHad(facture.getTaxable_d());
        last.setHae(facture.getTaxable_e());
        last.setHaf(facture.getTaxable_f());
        last.setVaa(facture.getTotal_tax_a());
        last.setVab(facture.getTotal_tax_b());
        last.setVac(facture.getTotal_tax_c());
        last.setVad(facture.getTotal_tax_d());
        last.setVae(facture.getTotal_tax_e());
        last.setVaf(facture.getTotal_tax_f());
        last.setHt(facture.getTotal_taxable());
        last.setTva(facture.getTotal_tax());
        last.setAib(0);
        last.setTs(0);
        last.setTotal(facture.getTotal());

        /* try {
        } catch (BadCredentialsException e) {
            throw new Exception("Le nom d'utilisateur et le mot de passe sont invalides.");
        }*/
        return last;
    }

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable(value = "name") String username) {
        return userService.getUser(username);
    }

    // Interface Général
    // Nombre de factures d'une date donnée
    @GetMapping("/nbrfacture/{date}")
    public int facture(@PathVariable(value = "date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return factureService.factureTotalToday(date);
        } catch (Exception e) {
            return 0;
        }
    }

    // Nombre de facture d'un mois donné
    @GetMapping("/nbrfacture/{year}/{month}")
    public int factureMonth(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            return factureService.factureMonth(year, month);
        } catch (Exception e) {
            return 0;
        }
    }

    // Total TTC d'une date donnée
    @GetMapping("/totalttc/{date}")
    public Double totalTTC(@PathVariable(value = "date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return factureService.totalTTC(date);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/totaltva/{date}")
    public Double totalTVA(@PathVariable(value = "date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return factureService.totalTVA(date);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/total/{year}/{month}")
    public Double total(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            return factureService.total(year, month);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/json/{year}/{month}")
    public Double totalMonthHT(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            return factureService.totalMoisHT(year, month);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/ttc/{year}/{month}/{day}")
    public double DayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day) {
        try {
            return factureService.DayTTC(year, month, day);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/betweenTtc/{day1}/{day2}")
    public double getBetweenTTC(@PathVariable(value = "day1")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try {
            return factureService.getBetweenTTC(day1, day2);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/betweenFactures/{day1}/{day2}")
    public double getBetweenFactures(@PathVariable(value = "day1")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try {
            return factureService.getBetweenFactures(day1, day2);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/factures/{year}/{month}/{day}")
    public int DayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day) {
        try {
            return factureService.DayFactures(year, month, day);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/countfacture")
    public long countfacture() {
        try {
            return factureService.countfacture();
        } catch (Exception e) {
            return 0;
        }

    }

    // tableau de bord Général
    // Nombre de fature par date
    @GetMapping("/countfacturebydate")
    public JSONObject getNbreFactureByDate() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        JSONObject obj = new JSONObject();

        for (Object[] ob : factureService.getNbreFactureByDate()) {
            String dt = sdf.format(ob[0]);
            Date date = sdf.parse(dt);
            long millis = date.getTime() / 1000;
            obj.put(millis, ob[1]);
        }
        return obj;
    }

    // Nombre de fature , total TTC et totalTVA
    @GetMapping("/totauxglobaux")
    public JSONObject totauxglobaux() {
        try {
            JSONObject obj = factureService.getTotauxGlobaux();
            obj.put("rapport", rapportService.rapport());
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

    // Nombre de fature , total TTC et totalTVA par année et par mois
    @GetMapping("/totauxmonth/{year}/{month}")
    public JSONObject getTotauxMonth(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            JSONObject obj = factureService.getTotauxMonth(year, month);
            obj.put("rapport", rapportService.MonthRapports(year, month));
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

    // Nombre de fature , total TTC,rapport et totalTVA par année par mois et par jour
    @GetMapping("/totauxday/{year}/{month}/{day}")
    public JSONObject getTotauxDay(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day) {
        try {
            JSONObject obj = factureService.getTotauxDay(year, month, day);
            obj.put("rapport", rapportService.rapportTotal(year, month, day));
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/facturesall")
    public List<FactureSelonSpecification> tout() {
        return factureService.tout();
    }
}
