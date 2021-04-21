package com.emcef.service;

import java.util.Date;

import com.emcef.repository.TBEntrepriseRepository;

import org.springframework.stereotype.Service;

@Service
public class TBEntrepriseService {
    @Autowired
    TBEntrepriseRepository tbEnRep;
    
    public int EntTotalFactureToday(Date date, int ifu) {
        return tbEnRep.EntTotalFactureToday(date, ifu);
    }
    public Double EntGetTotalTTC(Date date, int ifu){
        return tbEnRep.EntGetTotalTTC(date, ifu);
    }

    public Double EntGetTotalTVA(Date date, int ifu){
        return tbEnRep.EntGetTotalTVA(date, ifu);
    }
    
    public Double EntGetTotal(int year, int month, int ifu){
        return tbEnRep.EntGetTotal(year, month, ifu);
    }
    
    public Double EntTotalMonthTTC(int year, int day, int ifu){
    return tbEnRep.EntTotalMonthTTC(year, day, ifu);
    }
    
    public double EntDayTTC(int year, int month, int day, int ifu){
    return tbEnRep.EntDayTTC(year,month, day, ifu);
    }
    
    public int EntDayRapports(int year, int month, int day, int ifu){
    return tbEnRep.EntDayRapports(year,month, day, ifu);
    }
    
    public int EntDayFactures(int year, int month, int day, int ifu){
    return tbEnRep.EntDayFactures(year,month, day, ifu);
    }
    
    public double EntGetBetweenTTC(Date day1, Date day2, int ifu){
    return tbEnRep.EntGetBetweenTTC(day1, day2, ifu);
    }
    
    public double EntGetBetweenRapports(Date day1, Date day2, int ifu){
    return tbEnRep.EntGetBetweenRapports(day1, day2, ifu);
    }
    
    public double EntGetBetweenFactures(Date day1, Date day2, int ifu){
    return tbEnRep.EntGetBetweenFactures(day1, day2,ifu);
    }
}
