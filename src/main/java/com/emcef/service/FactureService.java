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

    public Double totalTTC() {
        return factureRepository.getTotalTTC();
    }

    public Double totalTVA() {
        return factureRepository.getTotalTVA();
    }

    public Long countfacture() {
        return factureRepository.nbrFact();
    }

    public void deleteFactureSelonSpecificationById(int id) {
        this.factureRepository.deleteById(id);
    }

    public List<FactureSelonSpecification> getAllFactureSelonSpecification() {
        return factureRepository.findAll();
    }

    public void saveFactureSelonSpecification(FactureSelonSpecification facture) {
        this.factureRepository.save(facture);
    }

    

    //Interface Générale
    public int factureTotalToday(Date date) {
        return factureRepository.TotalFactureToday(date);
    }

    public Double totalTTC(Date date) {
        return factureRepository.getTotalTTC(date);
    }

    public Double totalTVA(Date date) {
        return factureRepository.getTotalTVA(date);
    }

    public Double total(int year, int month) {
        return factureRepository.getTotal(year, month);
    }

    public Double totalMoisTTC(int year, int day) {
        return factureRepository.TotalMonthTTC(year, day);
    }
    
    public Double totalMoisHT(int year, int day) {
        return factureRepository.TotalMonthHT(year, day);
    }

    public double DayTTC(int year, int month, int day) {
        return factureRepository.DayTTC(year, month, day);
    }

    public int DayFactures(int year, int month, int day) {
        return factureRepository.DayFactures(year, month, day);
    }

    public double getBetweenTTC(Date day1, Date day2) {
        return factureRepository.getBetweenTTC(day1, day2);
    }

    public double getBetweenFactures(Date day1, Date day2) {
        return factureRepository.getBetweenFactures(day1, day2);
    }
    
    public int factureMonth(int year, int month){
    return factureRepository.factureMonth(year,month);
    }
    

    
    public List<Object[]> getNbreFactureByDate() {
       
        return factureRepository.getNbreFactureByDate();
    }

    public Object[] getTotauxGlobaux() {
    
        return factureRepository.getTotauxGlobaux();
    }

    public Object[] getTotauxMonth(int year , int month) {
    
        return factureRepository.getTotauxMonth(year,month);
    }

    public Object[] getTotauxDay(int year , int month, int day) {
    
        return factureRepository.getTotauxDay(year,month,day);
    }
}
