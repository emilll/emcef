/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

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
    @GetMapping("/nbrrapport/{date}")
    public int countRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try{
            return rapportService.rapportTotal(date);
        }catch(Exception e){
        return 0;
        }
    }
    
    //Interface Entreprise
    @GetMapping("/ent/nbrrapport/{date}/{ifu}")
    public int EntCountRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @PathVariable(value = "ifu") int ifu) {
        try{
            return rapportService.EntRapportTotal(date, ifu);
        }catch(Exception e){
        return 0;
        }
    }
    
    //Interface Machines
    @GetMapping("/mach/nbrrapport/{date}")
    public int MachCountRapport(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try{
            return rapportService.MachRapportTotal(date);
        }catch(Exception e){
        return 0;
        }
    }
}
