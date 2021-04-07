/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.restcontroller;



import com.emcef.model.FactureSelonSpecification;
import com.emcef.repository.FactureSelonSpecificationRepository;
import com.emcef.service.Autowired;
import com.emcef.service.FactureSelonSpecificationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class TableaudeBordController {
    @Autowired
    FactureSelonSpecificationService factureService;

    FactureSelonSpecificationRepository f;

    @GetMapping("/totalttc")
    public FactureSelonSpecification totalttc() {
    //    System.out.println("le total  : "+f.getTotalTTC());
        return null;
    }

    @GetMapping("/countfacture")
    public long countfacture() {
        return factureService.countfacture();
    }
}
