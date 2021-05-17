/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import java.util.Date;

import com.emcef.service.TBMachineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class TBMachineResController {


    @Autowired
    TBMachineService tbMachineService;

    // Interface Machines
    @GetMapping("/mach/nbrfacture/{date}")
    public int MachFacture(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, int ifu) {
        try {
            return tbMachineService.MachTotalFactureToday(date, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/totalttc/{date}")
    public Double MachTotalTTC(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
            int ifu) {
        try {
            return tbMachineService.MachGetTotalTTC(date, ifu);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/mach/totaltva/{date}")
    public Double MachTotalTVA(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
            int ifu) {
        try {
            return tbMachineService.MachGetTotalTVA(date, ifu);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/mach/total/{year}/{month}")
    public Double MachTotal(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month, int ifu) {
        try {
            return tbMachineService.MachGetTotal(year, month, ifu);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/mach/json/{year}/{month}")
    public Double MachTotalMonthTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            int ifu) {
        try {
            return tbMachineService.MachTotalMonthTTC(year, month, ifu);
        } catch (Exception e) {
            return 0.;
        }
    }

    @GetMapping("/mach/ttc/{year}/{month}/{day}")
    public double MachDayTTC(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day, int ifu) {
        try {
            return tbMachineService.MachDayTTC(year, month, day, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/betweenTtc/{day1}/{day2}")
    public double MachGetBetweenTTC(@PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try {
            return tbMachineService.MachGetBetweenTTC(day1, day2, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/betweenRapports/{day1}/{day2}")
    public double MachGetBetweenRapports(
            @PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try {
            return tbMachineService.MachGetBetweenRapports(day1, day2, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/betweenFactures/{day1}/{day2}")
    public double MachGetBetweenFactures(
            @PathVariable(value = "day1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day1,
            @PathVariable(value = "day2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date day2, int ifu) {
        try {
            return tbMachineService.MachGetBetweenFactures(day1, day2, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/rapports/{year}/{month}/{day}")
    public int MachDayRapports(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day, int ifu) {
        try {
            return tbMachineService.MachDayRapports(year, month, day, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping("/mach/factures/{year}/{month}/{day}")
    public int MachDayFactures(@PathVariable(value = "year") int year, @PathVariable(value = "month") int month,
            @PathVariable(value = "day") int day, int ifu) {
        try {
            return tbMachineService.MachDayFactures(year, month, day, ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    // @GetMapping("/ent/totauxglobaux/{ifu}")
    // public Object[] getEnttotauxglobaux(@PathVariable(value = "ifu") int ifu) {
    // try {
    // return tbMachineService.getTotauxGlobaux(ifu);
    // } catch (Exception e) {
    // return null;
    // }
    // }

    // @GetMapping("/ent/totauxmonth/{year}/{month}/{ifu}")
    // public Object[] getEntTotauxMonth(@PathVariable(value = "year") int year,
    // @PathVariable(value = "month") int month,
    // @PathVariable(value = "ifu") int ifu) {
    // try {
    // System.out.println(tbMachineService.getTotauxMonth(year, month, ifu));
    // return tbMachineService.getTotauxMonth(year, month, ifu);
    // } catch (Exception e) {
    // return null;
    // }
    // }

    // @GetMapping("/ent/totauxday/{year}/{month}/{day}/{ifu}")
    // public Object[] getEntTotauxDay(@PathVariable(value = "year") int year,
    // @PathVariable(value = "month") int month,
    // @PathVariable(value = "day") int day, @PathVariable(value = "ifu") int ifu) {

    // try {
    // return tbMachineService.getTotauxDay(year, month, day, ifu);
    // } catch (NullPointerException e) {
    // return null;
    // }
    // }

}
