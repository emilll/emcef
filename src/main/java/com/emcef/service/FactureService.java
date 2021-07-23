/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import com.emcef.repository.FactureRepository;
import java.util.Date;
import java.util.List;
import org.json.simple.JSONObject;

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

    public FactureSelonSpecification findAllByUid(String uid) {
        return factureRepository.findAllByUid(uid);
    }

    public Double totalTTC() {
        return factureRepository.getTotalTTC();
    }

    public Double totalTVA() {
        return factureRepository.getTotalTVA();
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

    public Double totalMoisTTC(int year, int day) {
        return factureRepository.TotalMonthTTC(year, day);
    }

    public Double totalMoisHT(int year, int day) {
        return factureRepository.TotalMonthHT(year, day);
    }

    public int DayFactures(int year, int month, int day) {
        return factureRepository.DayFactures(year, month, day);
    }

    public int factureMonth(int year, int month) {
        return factureRepository.factureMonth(year, month);
    }

    public JSONObject getTotauxDay(int year, int month, int day) {
        return factureRepository.getTotauxDay(year, month, day);
    }

    public Object[] getEntTotauxDay(int year, int month, int day, int ifu) {
        return factureRepository.getEntTotauxDay(year, month, day, ifu);
    }

    //Début API Demande de facture
    public void saveFacture(FactureSelonSpecification facture) {
        factureRepository.save(facture);
    }
    //Fin API Demande de facture

    //Début API demande de détails sur une facture en attente
    public JSONObject UidInfo(String uid) {
        return factureRepository.UidInfo(uid);
    }

    public List<JSONObject> Payement(String uid) {
        return factureRepository.Payement(uid);
    }

    public List<JSONObject> Item(int id) {
        return factureRepository.Item(id);
    }

    public int uidId(String uid) {
        return factureRepository.uidId(uid);
    }
//Fin API demande de détails sur une facture en attente

    public List<FactureSelonSpecification> tout() {
        return factureRepository.findAll();
    }

    public FactureSelonSpecification findById(int position) {
        return factureRepository.findById(position);
    }
}
