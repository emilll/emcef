/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.restcontroller;


import com.emcef.service.FactureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Em
 */
@RestController
@RequestMapping("/apitest")
public class TableaudeBordController {

    @Autowired
    FactureService factureService;

    @GetMapping("/totalttc")
    public Double getTotalTTC() {
        return factureService.totalTTC();
    }

    @GetMapping("/totaltva")
    public Double getTotalTVA() {
        return factureService.totalTVA();
    }

    @GetMapping("/nbrfacture")
    public long countfacture() {
        return factureService.countfacture();
    }

    @GetMapping("/totaux/{ifu}")
    public  @ResponseBody String getFactTotalContribuable ( @PathVariable(value="ifu")String ifu) {
        return factureService.getFactTotauxContribuable(ifu);
    }

    @GetMapping("/totaux/{ifu}/{dateFac}")
    public Double getFactTotalContribuable2(@PathVariable(value="ifu")String ifu,
    @PathVariable(name="dateFac")String dateFac) {
        System.out.println("je suis dans total");
        return factureService.getFactTotauxContribuable2(ifu,dateFac);
    }
}