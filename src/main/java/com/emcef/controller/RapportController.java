/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.service.RapportService;
import java.util.Date;
import java.util.regex.Pattern;
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
public class RapportController {

    @Autowired
    RapportService rapportService;

    public static boolean isNumeric(String string) {
        // Checks if the provided string
        // is a numeric by applying a regular
        // expression on it.
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, string);
    }

    @GetMapping("/nbrrapport/{date}")
    public long countfacture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        // String valeur = rapportService.rapportTotal(date).toString();
        // if (isNumeric(valeur)) {
        //     return rapportService.rapportTotal(date);
        // } else {
        //     return 0;
        // }

        try {
            return rapportService.rapportTotal(date);
        } catch (Exception e) {
            return 0;
        }
    }
}
