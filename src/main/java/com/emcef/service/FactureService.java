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

    public int factureMonth(int year, int month) {
        return factureRepository.factureMonth(year, month);
    }

    public List<Object[]> getNbreFactureByDate() {

        return factureRepository.getNbreFactureByDate();
    }

    public JSONObject getTotauxGlobaux() {
        return factureRepository.getTotauxGlobaux();
    }

    public JSONObject getTotauxMonth(int year, int month) {
        return factureRepository.getTotauxMonth(year, month);
    }

    public JSONObject getTotauxDay(int year, int month, int day) {
        return factureRepository.getTotauxDay(year, month, day);
    }

    public Object[] getEntTotauxDay(int year, int month, int day, int ifu) {
        return factureRepository.getEntTotauxDay(year, month, day, ifu);
    }

    //Début API Demande de facture
    public JSONObject getTaxGroup() {
        return factureRepository.getTaxGroup();
    }

    public void setFacture(String methode, int payed, String nim, Date date, String uid, long id, String ifu, String type, String contact1_client, String ifu_client, String nom_client, String adresse1_client, String operateur, String operateur_id, int taux_tax_a, int taux_tax_b, int taux_tax_c, int taux_tax_d, double total_a, double total_b, double total_c, double total_d, double total_e, double total_f, double taxable_b, double taxable_d, double total_tax_b, double total_tax_d, double total) {
        factureRepository.setFacture(methode, payed, nim, date, uid, id, ifu, type, contact1_client, ifu_client, nom_client, adresse1_client, operateur, operateur_id, taux_tax_a, taux_tax_b, taux_tax_c, taux_tax_d, total_a, total_b, total_c, total_d, total_e, total_f, taxable_b, taxable_d, total_tax_b, total_tax_d, total);
    }

    public void setLigneFacture(String code, double amount, double amounttaxable, String name, double price, double pricetaxable, double quantity, String taxratelabel, int tax, double taxamount, int facture_id) {
        factureRepository.setLigneFacture(code, amount, amounttaxable, name, price, pricetaxable, quantity, taxratelabel, tax, taxamount, facture_id);
    }

    public int getLastId() {
        return factureRepository.getLastId();
    }

    public JSONObject getAllFacture(int id) {
        return factureRepository.getAllFacture(id);
    }

    public String actualNim(String ifu) {
        return factureRepository.actualNim(ifu);
    }

    public String getIfu(String username) {
        return factureRepository.getIfu(username);
    }
    //Fin API Demande de facture

    //Début API Finalisation de facture
    public void confirmFacture(String uid) {
        factureRepository.confirmFacture(uid);
    }

    public int getId(String uid) {
        return factureRepository.getId(uid);
    }

    public void setFactureNormalisee(String codemecefdgi, String counters, String date_time, String nim, String qr_code, int facture_id) {
        factureRepository.setFactureNormalisee(codemecefdgi, counters, date_time, nim, qr_code, facture_id);
    }

    public int pendingFacture() {
        return factureRepository.pendingFacture();
    }

    public int validatedFacture() {
        return factureRepository.validatedFacture();
    }

    public Date getDate(String uid) {
        return factureRepository.getDate(uid);
    }

    public String getNim(String uid) {
        return factureRepository.getNim(uid);
    }
    //Fin API Finalisation de facture

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
}
