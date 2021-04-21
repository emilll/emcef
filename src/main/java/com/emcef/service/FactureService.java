/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import com.emcef.repository.FactureRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class FactureService {
    @Autowired
    FactureRepository factureRepository;

    //Interface Générale
    public int factureTotalToday(Date date) {
        return factureRepository.TotalFactureToday(date);
    }
    public Double totalTTC(Date date){
        return factureRepository.getTotalTTC(date);
    }

    public Double totalTVA(Date date){
        return factureRepository.getTotalTVA(date);
    }
    
    public Double total(int year, int month){
        return factureRepository.getTotal(year, month);
    }
    
    public Double totalMoisTTC(int year, int day){
    return factureRepository.TotalMonthTTC(year, day);
    }
    
    public double DayTTC(int year, int month, int day){
    return factureRepository.DayTTC(year,month, day);
    }
    
    public int DayRapports(int year, int month, int day){
    return factureRepository.DayRapports(year,month, day);
    }
    
    public int factureMonth(int year, int month){
    return factureRepository.factureMonth(year,month);
    }
    
    public int DayFactures(int year, int month, int day){
    return factureRepository.DayFactures(year,month, day);
    }
    
    public double getBetweenTTC(Date day1, Date day2){
    return factureRepository.getBetweenTTC(day1, day2);
    }
    
    public double getBetweenRapports(Date day1, Date day2){
    return factureRepository.getBetweenRapports(day1, day2);
    }
    
    public double getBetweenFactures(Date day1, Date day2){
    return factureRepository.getBetweenFactures(day1, day2);
    }
    
    //Interface Entreprise
    
    public int EntTotalFactureToday(Date date, int ifu) {
        return factureRepository.EntTotalFactureToday(date, ifu);
    }
    public Double EntGetTotalTTC(Date date, int ifu){
        return factureRepository.EntGetTotalTTC(date, ifu);
    }

    public Double EntGetTotalTVA(Date date, int ifu){
        return factureRepository.EntGetTotalTVA(date, ifu);
    }
    
    public Double EntGetTotal(int year, int month, int ifu){
        return factureRepository.EntGetTotal(year, month, ifu);
    }
    
    public Double EntTotalMonthTTC(int year, int day, int ifu){
    return factureRepository.EntTotalMonthTTC(year, day, ifu);
    }
    
    public double EntDayTTC(int year, int month, int day, int ifu){
    return factureRepository.EntDayTTC(year,month, day, ifu);
    }
    
    public int EntDayRapports(int year, int month, int day, int ifu){
    return factureRepository.EntDayRapports(year,month, day, ifu);
    }
    
    public int EntDayFactures(int year, int month, int day, int ifu){
    return factureRepository.EntDayFactures(year,month, day, ifu);
    }
    
    public double EntGetBetweenTTC(Date day1, Date day2, int ifu){
    return factureRepository.EntGetBetweenTTC(day1, day2, ifu);
    }
    
    public double EntGetBetweenRapports(Date day1, Date day2, int ifu){
    return factureRepository.EntGetBetweenRapports(day1, day2, ifu);
    }
    
    public double EntGetBetweenFactures(Date day1, Date day2, int ifu){
    return factureRepository.EntGetBetweenFactures(day1, day2,ifu);
    }
    
     //Interface Machines
    
    public int MachTotalFactureToday(Date date, int ifu) {
        return factureRepository.MachTotalFactureToday(date, ifu);
    }
    public Double MachGetTotalTTC(Date date, int ifu){
        return factureRepository.MachGetTotalTTC(date, ifu);
    }

    public Double MachGetTotalTVA(Date date, int ifu){
        return factureRepository.MachGetTotalTVA(date, ifu);
    }
    
    public Double MachGetTotal(int year, int month, int ifu){
        return factureRepository.MachGetTotal(year, month, ifu);
    }
    
    public Double MachTotalMonthTTC(int year, int day, int ifu){
    return factureRepository.MachTotalMonthTTC(year, day, ifu);
    }
    
    public double MachDayTTC(int year, int month, int day, int ifu){
    return factureRepository.MachDayTTC(year,month, day, ifu);
    }
    
    public int MachDayRapports(int year, int month, int day, int ifu){
    return factureRepository.MachDayRapports(year,month, day, ifu);
    }
    
    public int MachDayFactures(int year, int month, int day, int ifu){
    return factureRepository.MachDayFactures(year,month, day, ifu);
    }
    
    public double MachGetBetweenTTC(Date day1, Date day2, int ifu){
    return factureRepository.MachGetBetweenTTC(day1, day2, ifu);
    }
    
    public double MachGetBetweenRapports(Date day1, Date day2, int ifu){
    return factureRepository.MachGetBetweenRapports(day1, day2, ifu);
    }
    
    public double MachGetBetweenFactures(Date day1, Date day2, int ifu){
    return factureRepository.MachGetBetweenFactures(day1, day2,ifu);
    }
}
