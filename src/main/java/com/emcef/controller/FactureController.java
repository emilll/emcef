/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.dao.CalendrierTB;
import com.emcef.service.FactureService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @GetMapping("/countfractbydate")
    public List<CalendrierTB> getNbreFactureByDate() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        List<CalendrierTB> list = new ArrayList<>();

        for(Object[] ob : factureService.getNbreFactureByDate()){
            CalendrierTB ca = new CalendrierTB();
            String dt = sdf.format(ob[0]);
            Date date = sdf.parse(dt);
            long millis = date.getTime();

            ca.setmillis(""+millis);
            ca.setNbreFacture(""+ob[1]);

            list.add(ca);
        }
        System.out.println(list);

        return list;
    }

    @GetMapping("/countfacture")
    public long countfacture() {
        try {
            return factureService.countfacture();
        } catch (Exception e) {
            return 0;
        }
       
    }

    @GetMapping("/totauxglobaux")
    public Object[] totauxglobaux() {
        try {
            return factureService.getTotauxGlobaux();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/totauxmonth/{year}/{month}")
    public Object [] getTotauxMonth(@PathVariable(value = "year")int year,
    @PathVariable(value = "month") int month) {
        try {
            return factureService.getTotauxMonth(year,month);
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/totauxday/{year}/{month}/{day}")
    public Object [] getTotauxDay(@PathVariable(value = "year")int year,
    @PathVariable(value = "month") int month,
    @PathVariable(value = "day")int day) {
        try {
            return factureService.getTotauxDay(year,month,day);
        } catch (Exception e) {
            return null;
        }
    }
}
