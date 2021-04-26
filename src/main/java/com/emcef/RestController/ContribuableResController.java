/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.service.ContribuableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Em
 */
@RestController
@RequestMapping("/api")
public class ContribuableResController {

    @Autowired
    ContribuableService contribuableService;

    // rechercher et retourner un ID d'un contribuable par son ifu
    @GetMapping("/ent/findcontribuablebyifu/{ifu}")
    public int getByIfu(@PathVariable(value = "ifu") String ifu) {
        try {
            return contribuableService.getIdByIfu(ifu);
        } catch (Exception e) {
            return 0;
        }
    }

    // rechercher et retourner un ID d'un contribuable par le registre du commerce
    // (RCCM)
    @GetMapping("/ent/findcontribuablebyrccm/{rccm}")
    public int findContribuableByRccm(@PathVariable(value = "rccm") String rccm) {
        try {
            return contribuableService.getIdByRccm(rccm);
        } catch (Exception e) {
            return 0;
        }
    }

    // rechercher et retourner un ID d'un contribuable par la raison social (Nom)
    @GetMapping("/ent/findcontribuablebynom/{nom}")
    public int findContribuableByNom(@PathVariable(value = "nom") String nom) {
        try {
            return contribuableService.getIdByNom(nom);
        } catch (Exception e) {
            return 0;
        }
    }
}
