/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import com.emcef.model.FactureSelonSpecification;
import com.emcef.repository.FactureRepository;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EM
 * @author Holy
 */
@Service
public class FactureService {
    @Autowired
   FactureRepository factureRepository;

    public Double totalTTC(){
        return factureRepository.getTotalTTC();
    }

    public Double totalTVA(){
        return factureRepository.getTotalTVA();
    }

    public Long countfacture(){
        return factureRepository.nbrFact();
    }

    public String getFactTotauxContribuable(String ifu){
        return factureRepository.getFactTotauxContribuable(ifu);
    }

    public Double getFactTotauxContribuable2(String ifu, String d1){
        return factureRepository.getFactTotauxContribuable2(ifu,d1);
    }
    



    public void deleteFactureSelonSpecificationById(int id){
        this.factureRepository.deleteById(id);
    }

    public List<FactureSelonSpecification> getAllFactureSelonSpecification() {
        return factureRepository.findAll();
    }

    public void saveFactureSelonSpecification(FactureSelonSpecification facture) {
        this.factureRepository.save(facture);
    }
    
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
