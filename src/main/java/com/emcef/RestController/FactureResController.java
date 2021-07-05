/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.model.FactureNormalisee;
import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import com.emcef.model.MachinesInstallees;
import com.emcef.model.Rapportcr;
import com.emcef.model.TaxeGroupes;
import com.emcef.model.TypesFactures;
import com.emcef.model.TypesPaiement;
import com.emcef.model.User;
import com.emcef.request.ClientDto;
import com.emcef.request.FactureRequest;
import com.emcef.request.ItemDto;
import com.emcef.request.OperatorDto;
import com.emcef.request.PaymentDto;
import com.emcef.response.FactureResponse;
import com.emcef.response.FinalFactureResponse;
import com.emcef.service.ErreurService;
import com.emcef.service.FactureNormaliseeService;
import com.emcef.service.FactureService;
import com.emcef.service.LigneDeFactureService;
import com.emcef.service.MachineService;
import com.emcef.service.UserService;
import com.emcef.service.RapportService;
import com.emcef.service.TaxesService;
import com.emcef.service.TypesFacturesService;
import com.emcef.service.TypesPaiementService;
import com.emcef.utility.JWTUtility;
import com.emcef.utility.JwtRequest;
import com.emcef.utility.JwtResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import org.json.simple.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.joda.time.DateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class FactureResController {

    @Autowired
    ErreurService erreurService;

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
    TypesFacturesService typesFacturesService;

    @Autowired
    TypesPaiementService typesPaiementService;

    @Autowired
    LigneDeFactureService ligneDeFactureService;

    @Autowired
    FactureNormaliseeService factureNormaliseeService;

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

    public int deuxChiffres(int valeur) {
        int k = valeur;
        if (valeur < 10) {
            k = Integer.valueOf("0" + String.valueOf(valeur));
        }
        return k;
    }

    int count(Date date, List<FactureSelonSpecification> facture) {
        int resultat = 0;
        for (FactureSelonSpecification fct : facture) {
            if (fct.getDateTime() == date) {
                resultat = resultat + 1;
            }
        }
        return resultat;
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

    @GetMapping("/export")
    public JSONObject export(HttpServletResponse response) throws JRException, FileNotFoundException, IOException {
        JSONObject retour = new JSONObject();
        FactureSelonSpecification facture = factureService.findAllByUid("MmWj1yts-7MXF-CEDR-Hh0o-axr0h4BMaWQO");
        createPdfReport(ligneDeFactureService.articles(facture), facture, response);
        if ("success".equals(response.getHeader("Status"))) {
            retour.put("status", "success");
        } else {
            retour.put("status", "error");
        }
        return retour;
    }

    // Method to create the pdf file using the employee list datasource.
    private void createPdfReport(final List<LigneDeFacture> article, FactureSelonSpecification facture, HttpServletResponse response) throws JRException, FileNotFoundException, IOException {
        try {
            DateTime time = new DateTime();
            File file = ResourceUtils.getFile("classpath:facture.jrxml");
            JasperReport liste = JasperCompileManager.compileReport(file.getAbsolutePath());
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(article);
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("name", facture.getNom_commercial());
            parameters.put("date", facture.getDateTime());
            parameters.put("numero", "00001");
            parameters.put("ifuseller", facture.getIfuseller());
            parameters.put("adressseller", facture.getAdresse1());
            parameters.put("contactseller", facture.getContact1());
            parameters.put("mailseller", facture.getContact2());
            parameters.put("nameclient", facture.getNom_client());
            parameters.put("ifuclient", facture.getIfu_client());
            parameters.put("adressclient", facture.getAdresse1_client());
            parameters.put("contactclient", facture.getContact1_client());
            parameters.put("ttc", facture.getTotal());
            parameters.put("tva", facture.getTotal_tax());
            parameters.put("ht", facture.getTotal_taxable());
            parameters.put("qr", facture.getFactureNormalisee().getQrCode());
            parameters.put("code", facture.getFactureNormalisee().getCodeMECeFDGI());
            parameters.put("finaldate", facture.getFactureNormalisee().getDateTime());
            parameters.put("remise", "0");
            parameters.put("ts", "0");
            parameters.put("aib", "0");
            parameters.put("total", "0");
            parameters.put("taxe", "B");
            parameters.put("shortht", "");
            parameters.put("shorttva", "0");
            parameters.put("nim", facture.getNim());
            parameters.put("parts", ds);
            String path = "Facture" + time.toYearMonthDay() + "-" + time.getHourOfDay() + "H" + time.getMinuteOfHour() + "M" + time.getSecondOfMinute() + ".pdf";
            JasperPrint impression = JasperFillManager.fillReport(liste, parameters, new JREmptyDataSource());
            response.setContentType("application/x-download");
            response.addHeader("Content-disposition", "attachment; filename=" + path);
            response.addHeader("Status", "succes");
            OutputStream out = response.getOutputStream();
            response.getOutputStream().print("true");
            JasperExportManager.exportReportToPdfStream(impression, out);
        } catch (Exception e) {
            System.out.println(e);
            response.addHeader("Status", "error");
            response.getOutputStream().print("false");
        }
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

        FactureNormalisee normale = new FactureNormalisee();
        FinalFactureResponse finalFactureResponse = new FinalFactureResponse();
        FactureSelonSpecification facture = factureService.findAllByUid(uid);
        List<FactureSelonSpecification> all = factureService.tout();

        if ("confirm".equalsIgnoreCase(action)) {
            int id = facture.getId();
            Date date = facture.getDateTime();
            String code = "", qrcode = "", datetime = "", counters = "", nim = facture.getNim();
            String code1 = "", code2 = "", code3 = "", code4 = "", code5 = "", code6 = "";
            int total = 0, actuel = 0;
            for (FactureSelonSpecification str : all) {
                if (str.getNim() == nim) {
                    total += 1;
                    if (str.getType().equalsIgnoreCase(facture.getType())) {
                        actuel += 1;
                    }
                }
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            counters = total + "/" + actuel + " " + facture.getType();
            code1 = getParticularString(4);
            code2 = getParticularString(4);
            code3 = getParticularString(4);
            code4 = getParticularString(4);
            code5 = getParticularString(4);
            code6 = getParticularString(4);
            code = code1 + "-" + code2 + "-" + code3 + "-" + code4 + "-" + code5 + "-" + code6;
            datetime = transform(calendar.get(Calendar.DAY_OF_MONTH)) + "/" + transform(calendar.get(Calendar.MONTH) + 1) + "/" + transform(calendar.get(Calendar.YEAR)) + " " + transform(calendar.get(Calendar.HOUR_OF_DAY) + 1) + ":" + transform(calendar.get(Calendar.MINUTE)) + ":" + transform(calendar.get(Calendar.SECOND));
            qrcode = "F;" + nim + ";" + code1 + code2 + code3 + code4 + code5 + code6 + ";" + userService.getUser(userName).getIfu() + ";" + transform(calendar.get(Calendar.YEAR)) + transform(calendar.get(Calendar.MONTH) + 1) + transform(calendar.get(Calendar.DAY_OF_MONTH)) + transform(calendar.get(Calendar.HOUR_OF_DAY) + 1) + transform(calendar.get(Calendar.MINUTE)) + transform(calendar.get(Calendar.SECOND));
            normale.setCodeMECeFDGI(code);
            normale.setCounters(counters);
            normale.setDateTime(datetime);
            normale.setNim(nim);
            normale.setQrCode(qrcode);
            factureNormaliseeService.save(normale);
            facture.setFactureNormalisee(normale);
            facture.setStatus(Boolean.TRUE);
            factureService.saveFacture(facture);
            finalFactureResponse.setCodeMECeFDGI(code);
            finalFactureResponse.setCounters(counters);
            finalFactureResponse.setDateTime(datetime);
            finalFactureResponse.setNim(nim);
            finalFactureResponse.setQrCode(qrcode);
        }

        if ("cancel".equalsIgnoreCase(action)) {
            Date date = facture.getDateTime();
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

        FactureResponse last = new FactureResponse();
        List<String> messages = Arrays.asList("A", "B", "");
        List<String> taxeGroup = Arrays.asList("A", "B", "C", "D", "E", "F");
        List<String> tabPay = new ArrayList<>();

        if (factureRequest.getIfu().length() != 13) {
            last.setErrorCode("600");
            last.setErrorDesc("Demande de Facture - L'ifu doit avoir 13 caractères.");
            return last;
        } else {
            boolean test = false;
            for (TypesFactures str : typesFacturesService.getAll()) {
                if (str.getType().equalsIgnoreCase(factureRequest.getType())) {
                    test = true;
                    break;
                }
            }
            if (!test) {
                last.setErrorCode("3");
                last.setErrorDesc("Demande de Facture - " + erreurService.findByErrorCode("3").getErrorDesc());
                return last;
            } else {
                if (!messages.contains(factureRequest.getAib())) {
                    last.setErrorCode("6");
                    last.setErrorDesc("Demande de Facture - " + erreurService.findByErrorCode("6").getErrorDesc());
                    return last;
                } else {
                    if (factureRequest.getItems().isEmpty()) {
                        last.setErrorCode("8");
                        last.setErrorDesc("Demande de Facture - " + erreurService.findByErrorCode("8").getErrorDesc());
                        return last;
                    } else {
                        for (ItemDto str : factureRequest.getItems()) {
                            if (!taxeGroup.contains(str.getTaxGroup())) {
                                last.setErrorCode("9");
                                last.setErrorDesc("Demande de Facture -  " + erreurService.findByErrorCode("9").getErrorDesc());
                                return last;
                            }
                        }

                        for (TypesPaiement str : typesPaiementService.getAll()) {
                            tabPay.add(str.getType());
                        }

                        for (PaymentDto str : factureRequest.getPayment()) {
                            if (!tabPay.contains(str.getName())) {
                                last.setErrorCode("7");
                                last.setErrorDesc("Demande de Facture - " + erreurService.findByErrorCode("7").getErrorDesc());
                                return last;
                            }
                        }
                    }
                }
            }
        }

        double taa = 0, tab = 0, tac = 0, tad = 0, tae = 0, taf = 0, total = 0;
        double hta = 0, htb = 0, htc = 0, htd = 0, hte = 0, htf = 0;
        double tvaa = 0, tvab = 0, tvac = 0, tvad = 0, tvae = 0, tvaf = 0;
        FactureSelonSpecification facture = new FactureSelonSpecification();
        User user = userService.getUser(userName);
        MachinesInstallees machine = machineService.findAllByIfu(user.getIfu());
        TaxeGroupes tax = taxesService.findAllById(1L);
        double ht = 0, tva = 0, montantAib = 0;
        int tax_a = tax.getA(), tax_b = tax.getB(), tax_c = tax.getC(), tax_d = tax.getD(), tax_e = tax.getE(), tax_f = tax.getF(), aib = 0;
        Date maintenant = new Date();
        Date actuel = maintenant;
        actuel.setHours(maintenant.getHours() + 1);
        
        String uid = getAlphaNumericString(8) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(12);
        int position = factureService.tout().size() + 1;
        int taxe = 0;

        for (ItemDto str : factureRequest.getItems()) {
            int remise = factureRequest.getRemise();
            double remiseMontant = (remise * str.getPrice()) / 100;
            double modified = str.getPrice() - remiseMontant;
            if ("A".equalsIgnoreCase(str.getTaxGroup())) {
                taa = taa + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
            if ("B".equalsIgnoreCase(str.getTaxGroup())) {
                tab = tab + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
            if ("C".equalsIgnoreCase(str.getTaxGroup())) {
                tac = tac + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
            if ("D".equalsIgnoreCase(str.getTaxGroup())) {
                tad = tad + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
            if ("E".equalsIgnoreCase(str.getTaxGroup())) {
                tae = tae + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
            if ("F".equalsIgnoreCase(str.getTaxGroup())) {
                taf = taf + modified * str.getQuantity();
                total = total + modified * str.getQuantity();
            }
        }
        //Hors Taxe de chaque groupe de taxation
        hta = Math.round(((taa * 100) / (100 + tax_a)));
        htb = Math.round(((tab * 100) / (100 + tax_b)));
        htc = Math.round(((tac * 100) / (100 + tax_c)));
        htd = Math.round(((tad * 100) / (100 + tax_d)));
        hte = Math.round(((tae * 100) / (100 + tax_e)));
        htf = Math.round(((taf * 100) / (100 + tax_f)));

        //TVA de chaque groupe de taxation
        tvaa = Math.round(((taa * tax_a) / (100 + tax_a)));
        tvab = Math.round(((tab * tax_b) / (100 + tax_b)));
        tvac = Math.round(((tac * tax_c) / (100 + tax_c)));
        tvad = Math.round(((tad * tax_d) / (100 + tax_d)));
        tvae = Math.round(((tae * tax_e) / (100 + tax_e)));
        tvaf = Math.round(((taf * tax_f) / (100 + tax_f)));

        ht = hta + htb + htc + htd + hte + htf;
        tva = tvaa + tvab + tvac + tvad + tvae + tvad;

        String methode = "";
        Long montant = 0L;

        for (PaymentDto pay : factureRequest.getPayment()) {
            montant = pay.getAmount();
            methode = pay.getName();
        }
        
        
        switch(factureRequest.getAib())
        {
            case "A":
                aib = 1;
                montantAib = Math.round((ht * aib) / 100);
                total += montantAib;
                break;
            case "B":
                aib = 5;
                montantAib = Math.round((ht * aib) / 100);
                total += montantAib;
                break;
            case "":
                aib = 0;
                montantAib = Math.round((ht * aib) / 100);
                total += montantAib;
                break;
        }

        facture.setAdresse1(machine.getId_installation().getAdresse());
        facture.setAdresse1_client(factureRequest.getClient().getAddress());
        facture.setAdresse2(machine.getId_installation().getAdresse1());
        facture.setAdresse2_client(userName);
        facture.setAdresse3(machine.getId_installation().getEmail());
        facture.setAib(aib);
        facture.setCalcul(true);
        facture.setCompteur_schema_controleur(0);
        facture.setCompteur_total_controuleur(0);
        facture.setContact1(machine.getId_installation().getTelephone());
        facture.setContact1_client(factureRequest.getClient().getContact());
        facture.setContact2(machine.getId_installation().getContact_personnel());
        facture.setContact2_client("");
        facture.setControle_identifaction("");
        facture.setDateTime(actuel);
        facture.setDate_controleur(actuel);
        facture.setDate_heure_controleur(actuel);
        facture.setDate_requette(actuel);
        facture.setDonneecontrole_controleur("");
        facture.setId_document(numero(factureService.getAllFactureSelonSpecification().size()));
        facture.setId_fichier(0);
        facture.setIfu_client(factureRequest.getClient().getIfu());
        facture.setIfuseller(factureRequest.getIfu());
        facture.setInfo_date(maintenant);
        facture.setMethode(methode);
        facture.setMontant_aib(montantAib);
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
        facture.setTaxable_a(hta);
        facture.setTaxable_b(htb);
        facture.setTaxable_c(htc);
        facture.setTaxable_d(htd);
        facture.setTaxable_e(hte);
        facture.setTaxable_f(htf);
        facture.setTotal(total);
        facture.setTotal_a(taa);
        facture.setTotal_b(tab);
        facture.setTotal_c(tac);
        facture.setTotal_d(tad);
        facture.setTotal_e(tae);
        facture.setTotal_f(taf);
        facture.setTotal_tax(tva);
        facture.setTotal_tax_a(tvaa);
        facture.setTotal_tax_b(tvab);
        facture.setTotal_tax_c(tvac);
        facture.setTotal_tax_d(tvad);
        facture.setTotal_tax_e(tvae);
        facture.setTotal_tax_f(tvaf);
        facture.setTotal_tax_specifique(0);
        facture.setTotal_taxable(ht);
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
            int remise = factureRequest.getRemise();
            double remiseMontant = (remise * str.getPrice()) / 100;
            double modified = str.getPrice() - remiseMontant;
            double mont = modified * str.getQuantity();
            double ht_art = Math.round(((mont * 100) / (100 + taxe)));
            double tva_art = Math.round(((mont * taxe) / (100 + taxe)));
            LigneDeFacture article = new LigneDeFacture();
            article.setAmount(mont);
            article.setAmounttaxable(ht_art);
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
            article.setPrice(modified);
            article.setPricetaxable(str.getPrice());
            article.setQuantity(str.getQuantity());
            article.setTax(taxe);
            article.setTaxamount(tva_art);
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
        last.setAib(montantAib);
        last.setTs(0);
        last.setTotal(facture.getTotal());
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

    @GetMapping("/ttc")
    public List<Double> ttc() {
        try {
            int year = new Date().getYear() + 1900;
            List<FactureSelonSpecification> facture = factureService.getAllFactureSelonSpecification();
            double t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0, t11 = 0, t12 = 0;
            for (FactureSelonSpecification ftr : facture) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(ftr.getDateTime());
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 0) {
                    t1 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 1) {
                    t2 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 2) {
                    t3 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 3) {
                    t4 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 4) {
                    t5 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 5) {
                    t6 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 6) {
                    t7 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 7) {
                    t8 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 8) {
                    t9 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 9) {
                    t10 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 10) {
                    t11 += ftr.getTotal();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 11) {
                    t12 += ftr.getTotal();
                }
            }
            List<Double> liste = new ArrayList();
            liste.add(t1);
            liste.add(t2);
            liste.add(t3);
            liste.add(t4);
            liste.add(t5);
            liste.add(t6);
            liste.add(t7);
            liste.add(t8);
            liste.add(t9);
            liste.add(t10);
            liste.add(t11);
            liste.add(t12);
            return liste;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/ht")
    public List<Double> ht() {
        try {
            int year = new Date().getYear() + 1900;
            List<FactureSelonSpecification> facture = factureService.getAllFactureSelonSpecification();
            double t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0, t11 = 0, t12 = 0;
            for (FactureSelonSpecification ftr : facture) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(ftr.getDateTime());
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 0) {
                    t1 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 1) {
                    t2 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 2) {
                    t3 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 3) {
                    t4 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 4) {
                    t5 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 5) {
                    t6 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 6) {
                    t7 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 7) {
                    t8 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 8) {
                    t9 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 9) {
                    t10 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 10) {
                    t11 += ftr.getTotal_taxable();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 11) {
                    t12 += ftr.getTotal_taxable();
                }
            }
            List<Double> liste = new ArrayList();
            liste.add(t1);
            liste.add(t2);
            liste.add(t3);
            liste.add(t4);
            liste.add(t5);
            liste.add(t6);
            liste.add(t7);
            liste.add(t8);
            liste.add(t9);
            liste.add(t10);
            liste.add(t11);
            liste.add(t12);
            return liste;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/tva")
    public List<Double> tva() {
        try {
            int year = new Date().getYear() + 1900;
            List<FactureSelonSpecification> facture = factureService.getAllFactureSelonSpecification();
            double t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0, t11 = 0, t12 = 0;
            for (FactureSelonSpecification ftr : facture) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(ftr.getDateTime());
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 0) {
                    t1 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 1) {
                    t2 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 2) {
                    t3 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 3) {
                    t4 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 4) {
                    t5 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 5) {
                    t6 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 6) {
                    t7 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 7) {
                    t8 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 8) {
                    t9 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 9) {
                    t10 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 10) {
                    t11 += ftr.getTotal_tax();
                }
                if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == 11) {
                    t12 += ftr.getTotal_tax();
                }
            }
            List<Double> liste = new ArrayList();
            liste.add(t1);
            liste.add(t2);
            liste.add(t3);
            liste.add(t4);
            liste.add(t5);
            liste.add(t6);
            liste.add(t7);
            liste.add(t8);
            liste.add(t9);
            liste.add(t10);
            liste.add(t11);
            liste.add(t12);
            return liste;
        } catch (Exception e) {
            return null;
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
            return factureService.getAllFactureSelonSpecification().size();
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
        List<FactureSelonSpecification> facture = factureService.getAllFactureSelonSpecification();
        for (FactureSelonSpecification ob : facture) {
            String dt = sdf.format(ob.getDateTime());
            Date date = sdf.parse(dt);
            long millis = date.getTime() / 1000;
            obj.put(millis, count(ob.getDateTime(), facture));
        }
        return obj;
    }

    // Nombre de fature , total TTC et totalTVA
    @GetMapping("/totauxglobaux")
    public JSONObject totauxglobaux() {
        try {
            List<FactureSelonSpecification> facture = factureService.getAllFactureSelonSpecification();
            int nbre = 0;
            double totalTTC = 0, totalHT = 0, totalTVA = 0;
            nbre = facture.size();
            for (FactureSelonSpecification str : facture) {
                totalTTC = totalTTC + str.getTotal();
                totalHT = totalHT + str.getTotal_taxable();
                totalTVA = totalTVA + str.getTotal_tax();
            }
            JSONObject obj = new JSONObject();
            obj.put("nbre", nbre);
            obj.put("totalTTC", totalTTC);
            obj.put("totalHT", totalHT);
            obj.put("totalTVA", totalTVA);
            obj.put("rapport", rapportService.all().size());
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

    // Nombre de fature , total TTC et totalTVA par année et par mois
    @GetMapping("/totauxmonth/{year}/{month}")
    public JSONObject getTotauxMonth(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            Calendar calendar = Calendar.getInstance();
            int nbre = 0, rapports = 0;
            double totalTTC = 0, totalHT = 0, totalTVA = 0;
            for (FactureSelonSpecification str : factureService.getAllFactureSelonSpecification()) {
                calendar.setTime(str.getDateTime());
                if (deuxChiffres(calendar.get(Calendar.YEAR)) == year && deuxChiffres(calendar.get(Calendar.MONTH) + 1) == month) {
                    nbre = nbre + 1;
                    totalTTC = totalTTC + str.getTotal();
                    totalHT = totalHT + str.getTotal_taxable();
                    totalTVA = totalTVA + str.getTotal_tax();
                }
            }
            for (Rapportcr str : rapportService.all()) {
                calendar.setTime(str.getDate_heure());
                if (deuxChiffres(calendar.get(Calendar.YEAR)) == year && deuxChiffres(calendar.get(Calendar.MONTH) + 1) == month) {
                    rapports = rapports + 1;
                }
            }
            JSONObject obj = new JSONObject();
            obj.put("nbre", nbre);
            obj.put("totalTTC", totalTTC);
            obj.put("totalHT", totalHT);
            obj.put("totalTVA", totalTVA);
            obj.put("rapport", rapports);
            return obj;
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    // Nombre de fature , total TTC,rapport et totalTVA par année par mois et par jour
    @GetMapping("/totauxday/{year}/{month}/{day}")
    public JSONObject getTotauxDay(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day) {
        try {
            int nbre = 0, rapports = 0;
            double totalTTC = 0, totalHT = 0, totalTVA = 0;
            for (FactureSelonSpecification str : factureService.getAllFactureSelonSpecification()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(str.getDateTime());
                if (deuxChiffres(calendar.get(Calendar.YEAR)) == year && deuxChiffres(calendar.get(Calendar.MONTH) + 1) == month && deuxChiffres(calendar.get(Calendar.DAY_OF_MONTH)) == day) {
                    nbre = nbre + 1;
                    totalTTC = totalTTC + str.getTotal();
                    totalHT = totalHT + str.getTotal_taxable();
                    totalTVA = totalTVA + str.getTotal_tax();
                }
            }
            for (Rapportcr str : rapportService.all()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(str.getDate_heure());
                if (deuxChiffres(calendar.get(Calendar.YEAR)) == year && deuxChiffres(calendar.get(Calendar.MONTH) + 1) == month && deuxChiffres(calendar.get(Calendar.DAY_OF_MONTH)) == day) {
                    rapports = rapports + 1;
                }
            }
            JSONObject obj = new JSONObject();
            obj.put("nbre", nbre);
            obj.put("totalTTC", totalTTC);
            obj.put("totalHT", totalHT);
            obj.put("totalTVA", totalTVA);
            obj.put("rapport", rapports);
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
