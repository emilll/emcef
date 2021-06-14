/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.model.Contribuable;
import com.emcef.service.ContribuableService;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

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
    @GetMapping("/findcontribuablebyifu/{ifu}")
    public Contribuable getByIfu(@PathVariable(value = "ifu") String ifu) {
        Contribuable test = contribuableService.getByIfu(ifu);
        try {
            if(test != null){
            return test;
            }else{
            return new Contribuable();
            }
        } catch (Exception e) {
            return new Contribuable();
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

    @GetMapping("/contribuableall")
    public List<JSONObject> contribuables() {
        List<JSONObject> good = new ArrayList();
        for (Contribuable str : contribuableService.getAllContribuable()) {
            JSONObject test = new JSONObject();
            test.put("id", str.getId());
            test.put("date_heure", str.getDate_heure());
            test.put("ifu", str.getIfu());
            test.put("rccm", str.getRccm());
            test.put("nom", str.getNom());
            test.put("adresse", str.getAdresse());
            test.put("adresse2", str.getAdresse2());
            test.put("adresse3", str.getAdresse3());
            test.put("adresse4", str.getAdresse4());
            test.put("ville", str.getVille());
            test.put("zip", str.getZip());
            test.put("description_location", str.getDescription_location());
            test.put("telephone", str.getTelephone());
            test.put("contact_personnel", str.getContact_personnel());
            test.put("email", str.getEmail());
            test.put("date_enregistrement", str.getDate_enregistrement());
            test.put("id_activite", str.getId_activite());
            test.put("commentaire", str.getCommentaire());
            test.put("nbrMach", contribuableService.nrbMach(str.getIfu()));
            test.put("nbrFact", contribuableService.nrbFact(str.getIfu()));
            good.add(test);
        }
        return good;
    }
    
    @GetMapping("/contribuableall/{ifu}")
    public Contribuable findIfu(@PathVariable(value = "ifu") String ifu){
        return contribuableService.findAllByIfu(ifu);
    }
    
    @GetMapping("/machineall/{ifu}")
    public List<JSONObject> find(@PathVariable(value = "ifu") String ifu){
        List<JSONObject> resultat = new ArrayList();
        for (JSONObject str : contribuableService.allMach(ifu)) {
            str.put("nbrFact", contribuableService.nrbFactNim((String) str.get("nim")));
            resultat.add(str);
        }
        return resultat;
    }
}
