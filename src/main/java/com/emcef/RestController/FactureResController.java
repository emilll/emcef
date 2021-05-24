/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.model.User;
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
    RapportService rapportService;

    @Autowired
    UserService userService;

    @Autowired
    private JWTUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;
    

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
        //System.out.println(jwtRequest.getUsername());
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

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable(value = "name")String username) {
        return userService.getUser(username);
    }

    // Interface Général
    // Nombre de factures d'une date donnée
    @GetMapping("/nbrfacture/{date}")
    public int facture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
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
    public Double totalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return factureService.totalTTC(date);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/totaltva/{date}")
    public Double totalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
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
    public double getBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try {
            return factureService.getBetweenTTC(day1, day2);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/betweenFactures/{day1}/{day2}")
    public double getBetweenFactures(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
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
