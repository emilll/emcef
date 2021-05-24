/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import java.util.Date;
import com.emcef.repository.RapportRepository;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class RapportService {

    @Autowired
    RapportRepository rapportRepository;

    //Interface Générale
    public int rapport() {
        return rapportRepository.totalRapport();
    }

    //Début API Statut
    public int ifu(String username) {
        return rapportRepository.getIfu(username);
    }

    public String nim(int ifu) {
        return rapportRepository.getNim(ifu);
    }

    public String version(int ifu) {
        return rapportRepository.getVersion(ifu);
    }

    public int pendingCount() {
        return rapportRepository.getCountPending();
    }

    public List<JSONObject> pending() {
        return rapportRepository.getAllPending();
    }
    //Fin API Statut

    //Début API Information sur les e-mcf
    public List<JSONObject> Data() {
        return rapportRepository.getData();
    }
    //Fin API Information sur les e-mcf

    public int rapportTotal(int year, int month, int day) {
        return rapportRepository.nbrRapport(year, month, day);
    }

    public double getBetweenRapports(Date day1, Date day2) {
        return rapportRepository.getBetweenRapports(day1, day2);
    }

    public int MonthRapports(int year, int month) {
        return rapportRepository.MonthRapports(year, month);
    }

    //Interface Entreprise
    public int EntRapportTotal(Date date, int ifu) {
        return rapportRepository.nbrEntRapport(date, ifu);
    }

    //Interface Machines
    public int MachRapportTotal(Date date) {
        return rapportRepository.nbrMachRapport(date);
    }
}
