/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.restcontroller;

import com.emcef.service.RapportService;
import java.util.Date;
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

    //Interface Général
    @GetMapping("/nbrrapport")
    public int Rapport() {
        try {
            return rapportService.rapport();
        } catch (Exception e) {
            return 0;
        }
    }
    
    @GetMapping("/nbrrapport/{date}")
    public int countRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try {
            return rapportService.rapportTotal(date);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/rapports/{year}/{month}")
    public int MonthRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {
        try {
            return rapportService.MonthRapports(year, month);
        } catch (Exception e) {
            return 0;
        }
    }
    
        @GetMapping("/betweenRapports/{day1}/{day2}")
    public double getBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try {
            return rapportService.getBetweenRapports(day1, day2);
        } catch (Exception e) {
            return 0;
        }
    }

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
