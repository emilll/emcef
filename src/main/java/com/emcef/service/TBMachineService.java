/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.repository.TBMachineRepository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EM
 * @author Holy
 */
@Service
public class TBMachineService {
    @Autowired
    TBMachineRepository tbMachRep;

    public int MachTotalFactureToday(Date date, int ifu) {
        return tbMachRep.MachTotalFactureToday(date, ifu);
    }

    public Double MachGetTotalTTC(Date date, int ifu) {
        return tbMachRep.MachGetTotalTTC(date, ifu);
    }

    public Double MachGetTotalTVA(Date date, int ifu) {
        return tbMachRep.MachGetTotalTVA(date, ifu);
    }

    public Double MachGetTotal(int year, int month, int ifu) {
        return tbMachRep.MachGetTotal(year, month, ifu);
    }

    public Double MachTotalMonthTTC(int year, int day, int ifu) {
        return tbMachRep.MachTotalMonthTTC(year, day, ifu);
    }

    public double MachDayTTC(int year, int month, int day, int ifu) {
        return tbMachRep.MachDayTTC(year, month, day, ifu);
    }

    public int MachDayRapports(int year, int month, int day, int ifu) {
        return tbMachRep.MachDayRapports(year, month, day, ifu);
    }

    public int MachDayFactures(int year, int month, int day, int ifu) {
        return tbMachRep.MachDayFactures(year, month, day, ifu);
    }

    public double MachGetBetweenTTC(Date day1, Date day2, int ifu) {
        return tbMachRep.MachGetBetweenTTC(day1, day2, ifu);
    }

    public double MachGetBetweenRapports(Date day1, Date day2, int ifu) {
        return tbMachRep.MachGetBetweenRapports(day1, day2, ifu);
    }

    public double MachGetBetweenFactures(Date day1, Date day2, int ifu) {
        return tbMachRep.MachGetBetweenFactures(day1, day2, ifu);
    }

    public Object[] getTotauxGlobaux(int ifu) {
        return tbMachRep.getEntTotauxGlobaux(ifu);
    }

    public Object[] getTotauxMonth(int year, int month, int ifu) {
        return tbMachRep.getEntTotauxMonth(year, month, ifu);
    }

    public Object[] getTotauxDay(int year, int month, int day, int ifu) {
        return tbMachRep.getEntTotauxDay(year, month, day, ifu);
        // System.out.println(tbEnRep.getEntTotauxDay(year,month,day,ifu));
    }

}
