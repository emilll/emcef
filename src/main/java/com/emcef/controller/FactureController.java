/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.service.FactureService;
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
public class FactureController {

    @Autowired
    FactureService factureService;

    @GetMapping("/nbrfacture/{date}")
    public int facture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try{
            return factureService.factureTotalToday(date);
        }catch(Exception e){
        return 0;
        }
    }
    
    @GetMapping("/totalttc/{date}")
     public Double totalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) { 
        try{
            return factureService.totalTTC(date);
        }catch(Exception e){
        return 0.;
        }
    }
     
     @GetMapping("/totaltva/{date}")
      public Double totalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {        
        try{
            return factureService.totalTVA(date);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/json/{year}/{month}")
      public Double totalMonthTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {       
        try{
            return factureService.totalMoisTTC(year, month);
        }catch(Exception e){
        return 0.;
        }
    }
}
