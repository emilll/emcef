/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.repository.TBEntrepriseRepository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EM
 * @author Holy
 */
@Service
public class TBEntrepriseService {
    @Autowired
    TBEntrepriseRepository tbEnRep;

    public int EntTotalFactureToday(Date date, int ifu) {
        return tbEnRep.EntTotalFactureToday(date, ifu);
    }

    public Double EntGetTotalTTC(Date date, int ifu) {
        return tbEnRep.EntGetTotalTTC(date, ifu);
    }

    public Double EntGetTotalTVA(Date date, int ifu) {
        return tbEnRep.EntGetTotalTVA(date, ifu);
    }

    public Double EntGetTotal(int year, int month, int ifu) {
        return tbEnRep.EntGetTotal(year, month, ifu);
    }

    public Double EntTotalMonthTTC(int year, int day, int ifu) {
        return tbEnRep.EntTotalMonthTTC(year, day, ifu);
    }

    public double EntDayTTC(int year, int month, int day, int ifu) {
        return tbEnRep.EntDayTTC(year, month, day, ifu);
    }

    public int EntDayRapports(int year, int month, int day, int ifu) {
        return tbEnRep.EntDayRapports(year, month, day, ifu);
    }

    public int EntDayFactures(int year, int month, int day, int ifu) {
        return tbEnRep.EntDayFactures(year, month, day, ifu);
    }

    public double EntGetBetweenTTC(Date day1, Date day2, int ifu) {
        return tbEnRep.EntGetBetweenTTC(day1, day2, ifu);
    }

    public double EntGetBetweenRapports(Date day1, Date day2, int ifu) {
        return tbEnRep.EntGetBetweenRapports(day1, day2, ifu);
    }

    public double EntGetBetweenFactures(Date day1, Date day2, int ifu) {
        return tbEnRep.EntGetBetweenFactures(day1, day2, ifu);
    }

    public Object[] getTotauxGlobaux(int ifu) {
        return tbEnRep.getEntTotauxGlobaux(ifu);
    }

    public Object[] getTotauxMonth(int year, int month, int ifu) {
        return tbEnRep.getEntTotauxMonth(year, month, ifu);
    }

    public Object[] getTotauxDay(int year, int month, int day, int ifu) {
        return tbEnRep.getEntTotauxDay(year, month, day, ifu);
        // System.out.println(tbEnRep.getEntTotauxDay(year,month,day,ifu));
    }

}
