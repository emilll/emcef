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
}
