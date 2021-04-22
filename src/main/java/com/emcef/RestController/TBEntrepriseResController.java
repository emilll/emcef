package com.emcef.RestController;

import java.util.Date;

import com.emcef.service.Autowired;
import com.emcef.service.TBEntrepriseService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TBEntrepriseResController {

    @Autowired
    TBEntrepriseService tbEntrepriseService;
    
    @GetMapping("/ent/nbrfacture/{date}/{ifu}")
    public int EntFacture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) {
        try{
            return tbEntrepriseService.EntTotalFactureToday(date, ifu);
        }catch(Exception e){
        return 0;
        }
    }
    
    @GetMapping("/ent/totalttc/{date}/{ifu}")
     public Double EntTotalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) { 
        try{
            return tbEntrepriseService.EntGetTotalTTC(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
     
     @GetMapping("/ent/totaltva/{date}/{ifu}")
      public Double EntTotalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) {        
        try{
            return tbEntrepriseService.EntGetTotalTVA(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/total/{year}/{month}/{ifu}")
      public Double EntTotal(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,@PathVariable(value = "ifu") int ifu) {        
        try{
            return tbEntrepriseService.EntGetTotal(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/json/{year}/{month}/{ifu}")
      public Double EntTotalMonthTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,@PathVariable(value = "ifu") int ifu) {       
        try{
            return tbEntrepriseService.EntTotalMonthTTC(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/ttc/{year}/{month}/{day}/{ifu}")
      public double EntDayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {
        try{
            return tbEntrepriseService.EntDayTTC(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenTtc/{day1}/{day2}/{ifu}")
      public double EntGetBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return tbEntrepriseService.EntGetBetweenTTC(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenRapports/{day1}/{day2}/{ifu}")
      public double EntGetBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return tbEntrepriseService.EntGetBetweenRapports(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenFactures/{day1}/{day2}/{ifu}")
      public double EntGetBetweenFactures(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return tbEntrepriseService.EntGetBetweenFactures(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/rapports/{year}/{month}/{day}/{ifu}")
      public int EntDayRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {       
        try{
            return tbEntrepriseService.EntDayRapports(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/factures/{year}/{month}/{day}/{ifu}")
      public int EntDayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {       
        try{
            return tbEntrepriseService.EntDayFactures(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
    
}
