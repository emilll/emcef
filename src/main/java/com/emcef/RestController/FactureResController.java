/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

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
public class FactureResController {

    @Autowired
    FactureService factureService;
    
    //Interface Général

    //Nombre de factures d'une date donnée
    @GetMapping("/nbrfacture/{date}")
    public int facture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        try{
            return factureService.factureTotalToday(date);
        }catch(Exception e){
        return 0;
        }
    }
    
    //Nombre de facture d'un mois donné
    @GetMapping("/nbrfacture/{year}/{month}")
      public int factureMonth(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {        
        try{
            return factureService.factureMonth(year, month);
        }catch(Exception e){
        return 0;
        }
    }
    
      //Total TTC d'une date donnée
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
      
      @GetMapping("/total/{year}/{month}")
      public Double total(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month) {        
        try{
            return factureService.total(year, month);
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
      
      @GetMapping("/ttc/{year}/{month}/{day}")
      public double DayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day) {
        try{
            return factureService.DayTTC(year, month, day);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/betweenTtc/{day1}/{day2}")
      public double getBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try{
            return factureService.getBetweenTTC(day1, day2);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/betweenRapports/{day1}/{day2}")
      public double getBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try{
            return factureService.getBetweenRapports(day1, day2);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/betweenFactures/{day1}/{day2}")
      public double getBetweenFactures(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2) {
        try{
            return factureService.getBetweenFactures(day1, day2);
        }catch(Exception e){
        return 0;
        }
    }
      
      
      @GetMapping("/rapports/{year}/{month}/{day}")
      public int DayRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day) {       
        try{
            return factureService.DayRapports(year, month, day);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/factures/{year}/{month}/{day}")
      public int DayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day) {       
        try{
            return factureService.DayFactures(year, month, day);
        }catch(Exception e){
        return 0;
        }
    }
      
      //Interface Entreprise
      
      @GetMapping("/ent/nbrfacture/{date}/{ifu}")
    public int EntFacture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) {
        try{
            return factureService.EntTotalFactureToday(date, ifu);
        }catch(Exception e){
        return 0;
        }
    }
    
    @GetMapping("/ent/totalttc/{date}/{ifu}")
     public Double EntTotalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) { 
        try{
            return factureService.EntGetTotalTTC(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
     
     @GetMapping("/ent/totaltva/{date}/{ifu}")
      public Double EntTotalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,@PathVariable(value = "ifu") int ifu) {        
        try{
            return factureService.EntGetTotalTVA(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/total/{year}/{month}/{ifu}")
      public Double EntTotal(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,@PathVariable(value = "ifu") int ifu) {        
        try{
            return factureService.EntGetTotal(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/json/{year}/{month}/{ifu}")
      public Double EntTotalMonthTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,@PathVariable(value = "ifu") int ifu) {       
        try{
            return factureService.EntTotalMonthTTC(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/ent/ttc/{year}/{month}/{day}/{ifu}")
      public double EntDayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {
        try{
            return factureService.EntDayTTC(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenTtc/{day1}/{day2}/{ifu}")
      public double EntGetBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return factureService.EntGetBetweenTTC(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenRapports/{day1}/{day2}/{ifu}")
      public double EntGetBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return factureService.EntGetBetweenRapports(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/betweenFactures/{day1}/{day2}/{ifu}")
      public double EntGetBetweenFactures(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2,@PathVariable(value = "ifu") int ifu) {
        try{
            return factureService.EntGetBetweenFactures(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/rapports/{year}/{month}/{day}/{ifu}")
      public int EntDayRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {       
        try{
            return factureService.EntDayRapports(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/ent/factures/{year}/{month}/{day}/{ifu}")
      public int EntDayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day,@PathVariable(value = "ifu") int ifu) {       
        try{
            return factureService.EntDayFactures(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      //Interface Machines
      
      @GetMapping("/mach/nbrfacture/{date}")
    public int MachFacture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, int ifu) {
        try{
            return factureService.MachTotalFactureToday(date, ifu);
        }catch(Exception e){
        return 0;
        }
    }
    
    @GetMapping("/mach/totalttc/{date}")
     public Double MachTotalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, int ifu) { 
        try{
            return factureService.MachGetTotalTTC(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
     
     @GetMapping("/mach/totaltva/{date}")
      public Double MachTotalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, int ifu) {        
        try{
            return factureService.MachGetTotalTVA(date, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/mach/total/{year}/{month}")
      public Double MachTotal(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, int ifu) {        
        try{
            return factureService.MachGetTotal(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/mach/json/{year}/{month}")
      public Double MachTotalMonthTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, int ifu) {       
        try{
            return factureService.MachTotalMonthTTC(year, month, ifu);
        }catch(Exception e){
        return 0.;
        }
    }
      
      @GetMapping("/mach/ttc/{year}/{month}/{day}")
      public double MachDayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day, int ifu) {
        try{
            return factureService.MachDayTTC(year, month, day,ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/mach/betweenTtc/{day1}/{day2}")
      public double MachGetBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try{
            return factureService.MachGetBetweenTTC(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/mach/betweenRapports/{day1}/{day2}")
      public double MachGetBetweenRapports(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try{
            return factureService.MachGetBetweenRapports(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/mach/betweenFactures/{day1}/{day2}")
      public double MachGetBetweenFactures(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1, @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try{
            return factureService.MachGetBetweenFactures(day1, day2, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/mach/rapports/{year}/{month}/{day}")
      public int MachDayRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day, int ifu) {       
        try{
            return factureService.MachDayRapports(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
      
      @GetMapping("/mach/factures/{year}/{month}/{day}")
      public int MachDayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, @PathVariable(value = "day") int day, int ifu) {       
        try{
            return factureService.MachDayFactures(year, month, day, ifu);
        }catch(Exception e){
        return 0;
        }
    }
}
