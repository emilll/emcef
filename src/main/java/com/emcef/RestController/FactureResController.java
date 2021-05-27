/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.model.User;
import com.emcef.request.FactureRequest;
import com.emcef.request.ItemDto;
import com.emcef.response.FactureResponse;
import com.emcef.response.FinalFactureResponse;
import com.emcef.service.FactureService;
import com.emcef.service.UserService;
import com.emcef.service.RapportService;
import com.emcef.utility.JWTUtility;
import com.emcef.utility.JwtRequest;
import com.emcef.utility.JwtResponse;
import org.json.simple.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    UserService userService;

    @Autowired
    RapportService rapportService;

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
    
    public String transform(int valeur) {
        String val = "" + valeur;
        if ( valeur < 10) {
            val = "0"+valeur;
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

    if ("confirm".equals(action) 
        ) {
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
        datetime = transform(date.getDate()) + "/" + transform(date.getMonth()+1) + "/" + transform(date.getYear()+1900) + " " + transform(date.getHours()) + ":" + transform(date.getMinutes()) + ":" + transform(date.getSeconds());
        nim = factureService.getNim(uid);
        qrcode = "F;" + nim + ";" + code1 + code2 + code3 + code4 + code5 + code6 + ";" + factureService.getIfu(userName) + ";" + transform(date.getYear()+1900) + transform(date.getMonth()+1) + transform(date.getDate()) + transform(date.getHours()) + transform(date.getMinutes()) + transform(date.getSeconds());
        factureService.setFactureNormalisee(code, counters, datetime, nim, qrcode, id);
        finalFactureResponse.setCodeMECeFDGI(code);
        finalFactureResponse.setCounters(counters);
        finalFactureResponse.setDateTime(datetime);
        finalFactureResponse.setNim(nim);
        finalFactureResponse.setQrCode(qrcode);
    }

    if ("cancel".equals(action) 
        ) {
            Date date = factureService.getDate(uid);
        String datetime = date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
        finalFactureResponse.setDateTime(datetime);
    }
    return finalFactureResponse ;
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
        JSONObject tax = factureService.getTaxGroup();
        int tax_a = (int) tax.get("a"), tax_b = (int) tax.get("b"), tax_c = (int) tax.get("c"), tax_d = (int) tax.get("d");
        Date maintenant = new Date();
        String uid = getAlphaNumericString(8) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(4) + "-" + getAlphaNumericString(12);
        int position = factureService.getLastId() + 1;
        int taxe = 0;

        for (ItemDto str : factureRequest.getItems()) {
            if ("A".equals(str.getTaxGroup())) {
                taa = taa + str.getPrice() * str.getQuantity();
            }
            if ("B".equals(str.getTaxGroup())) {
                tab = tab + str.getPrice() * str.getQuantity();
            }
            if ("C".equals(str.getTaxGroup())) {
                tac = tac + str.getPrice() * str.getQuantity();
            }
            if ("D".equals(str.getTaxGroup())) {
                tad = tad + str.getPrice() * str.getQuantity();
            }
            if ("E".equals(str.getTaxGroup())) {
                tae = tae + str.getPrice() * str.getQuantity();
            }
            if ("F".equals(str.getTaxGroup())) {
                taf = taf + str.getPrice() * str.getQuantity();
            }
            total = total + (str.getPrice() * str.getQuantity());
        }

        factureService.setFacture(
                factureService.actualNim(factureService.getIfu(userName)),
                maintenant,
                uid,
                position,
                factureRequest.getIfu(),
                factureRequest.getType(),
                factureRequest.getClient().getContact(),
                factureRequest.getClient().getIfu(),
                factureRequest.getClient().getName(),
                factureRequest.getClient().getAddress(),
                factureRequest.getOperator().getName(),
                factureRequest.getOperator().getId(),
                tax_a,
                tax_b,
                tax_c,
                tax_d,
                taa,
                tab,
                tac,
                tad,
                tae,
                taf,
                tab - (tab * (tax_b * 0.01)),
                tad - (tad * (tax_d * 0.01)),
                tab * (tax_b * 0.01),
                tad * (tax_d * 0.01),
                total
        );

        String group = "";
        for (ItemDto str : factureRequest.getItems()) {

            if ("A".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("a");
                group = "A";
            }
            if ("B".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("a");
                group = "B";
            }
            if ("C".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("c");
                group = "C";
            }
            if ("D".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("d");
                group = "D";
            }
            if ("E".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("e");
                group = "E";
            }
            if ("F".equals(str.getTaxGroup())) {
                taxe = (int) tax.get("f");
                group = "F";
            }
            double mont = str.getPrice() * str.getQuantity();
            double ht = mont - (mont * (taxe / 100));
            factureService.setLigneFacture(str.getCode(), str.getPrice() * str.getQuantity(), ht, str.getName(), str.getPrice(), str.getPrice() * (taxe / 100), str.getQuantity(), group, taxe, mont * (taxe / 100), position);
        }

        JSONObject reponse = factureService.getAllFacture(position);
        FactureResponse last = new FactureResponse();

        last.setUid(uid);
        last.setTa((int) reponse.get("taux_tax_a"));
        last.setTb((int) reponse.get("taux_tax_b"));
        last.setTc((int) reponse.get("taux_tax_c"));
        last.setTd((int) reponse.get("taux_tax_d"));
        last.setTaa((double) reponse.get("total_a"));
        last.setTab((double) reponse.get("total_b"));
        last.setTac((double) reponse.get("total_c"));
        last.setTad((double) reponse.get("total_d"));
        last.setTae((double) reponse.get("total_e"));
        last.setTaf((double) reponse.get("total_f"));
        last.setHab((double) reponse.get("taxable_b"));
        last.setHad((double) reponse.get("taxable_d"));
        last.setVab((double) reponse.get("total_tax_b"));
        last.setVad((double) reponse.get("total_tax_d"));
        last.setAib(0);
        last.setTs(0);
        last.setTotal((double) reponse.get("total"));

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

}
