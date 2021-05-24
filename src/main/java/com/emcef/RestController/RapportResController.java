/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.response.StatutEmcfResponse;
import com.emcef.response.StatutResponse;
import com.emcef.service.RapportService;
import com.emcef.utility.JWTUtility;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class RapportResController {

    @Autowired
    RapportService rapportService;

    @GetMapping("/betweenRapports/{day1}/{day2}")
    public double getBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try {
            return rapportService.getBetweenRapports(day1, day2);
        } catch (Exception e) {
            return 0;
        }
    }

    //Début API Statut
    @Autowired
    private JWTUtility jwtUtility;

    @Autowired
    StatutResponse statutResponse;

    @GetMapping("/invoice")
    public StatutResponse ifu(HttpServletRequest httpServletRequest) throws ServletException, IOException {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;
        int ifu = 0;
        Date valid = null;

        if (null != authorization && authorization.startsWith("Bearer ")) {
            token = authorization.substring(7);
            userName = jwtUtility.getUsernameFromToken(token);
            valid = jwtUtility.getExpirationDateFromToken(token);
            ifu = rapportService.ifu(userName);
        }
        List<JSONObject> valeur = new ArrayList<JSONObject>();
        valeur = rapportService.pending();
        statutResponse.setIfu(ifu);
        statutResponse.setNim(rapportService.nim(ifu));
        statutResponse.setVersion(rapportService.version(ifu));
        statutResponse.setTokenValid(valid);
        statutResponse.setServerDateTime(new Date());
        statutResponse.setPendingRequestsCount(rapportService.pendingCount());
        statutResponse.setPendingRequestsList(valeur);

        return statutResponse;
    }

    //Fin API Statut
    //Début API Information sur les e-mcf
    @Autowired
    StatutEmcfResponse statutEmcfResponse;

    @GetMapping("/info/status")
    public StatutEmcfResponse status(HttpServletRequest httpServletRequest) throws ServletException, IOException {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;
        int ifu = 0;
        Date valid = null;

        if (null != authorization && authorization.startsWith("Bearer ")) {
            token = authorization.substring(7);
            userName = jwtUtility.getUsernameFromToken(token);
            valid = jwtUtility.getExpirationDateFromToken(token);
            ifu = rapportService.ifu(userName);
        }
        statutEmcfResponse.setIfu(ifu);
        statutEmcfResponse.setNim(rapportService.nim(ifu));
        statutEmcfResponse.setVersion(rapportService.version(ifu));
        statutEmcfResponse.setTokenValid(valid);
        statutEmcfResponse.setServerDateTime(new Date());
        statutEmcfResponse.setEmcfList(rapportService.Data());

        return statutEmcfResponse;
    }
    //Fin API Information sur les e-mcf

    //Interface Entreprise
    @GetMapping("/ent/nbrrapport/{date}/{ifu}")
    public int EntCountRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @PathVariable(value = "ifu") int ifu) {
        try {
            return rapportService.EntRapportTotal(date, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    //Interface Machines
    @GetMapping("/mach/nbrrapport/{date}")
    public int MachCountRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return rapportService.MachRapportTotal(date);
        } catch (Exception e) {
            return 0;
        }
    }
}
