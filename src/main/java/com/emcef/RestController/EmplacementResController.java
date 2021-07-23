/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.Commune;
import com.emcef.model.Departement;
import com.emcef.model.Installations;
import com.emcef.model.Pays;
import com.emcef.model.Quartier;
import com.emcef.model.Ville;
import com.emcef.service.EmplacementService;
import com.emcef.service.SellerService;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/save")
public class EmplacementResController {

    @Autowired
    EmplacementService emplacementService;

    @Autowired
    SellerService sellerService;

    @PostMapping("/place")
    public JSONObject savePlace(@RequestBody Installations installations) {
        JSONObject reponse = new JSONObject();
        boolean test = false;
        sellerService.savePlace(installations);
        for (Installations str : sellerService.getAll()) {
            if (str == installations) {
                test = true;
            }
        }

        if (test) {
            reponse.put("status", true);
        } else {
            reponse.put("status", false);
        }

        return reponse;
    }

    @GetMapping("/allPays")
    public List<Pays> allPays() {
        return emplacementService.allPays();
    }

    @GetMapping("/allDepartements")
    public List<Departement> allDepartements() {
        return emplacementService.allDepartements();
    }

    @GetMapping("/allCommunes")
    public List<Commune> allCommunes() {
        return emplacementService.allCommunes();
    }

    @GetMapping("/allVilles")
    public List<Ville> allVilles() {
        return emplacementService.allVilles();
    }

    @GetMapping("/pays/{country}")
    public JSONObject savePays(@PathVariable(value = "country") String nom) {
        JSONObject reponse = new JSONObject();
        Pays pays = new Pays();
        pays.setNom(nom);
        String result = emplacementService.savePays(pays);
        if ("true".equals(result)) {
            reponse.put("message", "Pays enregistré avec succès!");
            reponse.put("status", result);
        }
        if ("false".equals(result)) {
            reponse.put("message", "Une erreur est survenue lors de l'enregistrement du Pays!");
            reponse.put("status", result);
        }
        if ("exist".equals(result)) {
            reponse.put("message", "Le Pays que vous voulez enregistrer existe déjà!");
            reponse.put("status", result);
        }
        return reponse;
    }

    @GetMapping("/departement/{dp}/{id}")
    public JSONObject saveDepartement(@PathVariable(value = "dp") String nom, @PathVariable(value = "id") int id) {
        JSONObject reponse = new JSONObject();
        Departement departement = new Departement();
        Pays pays = emplacementService.findPaysById(id);
        departement.setNom(nom);
        departement.setPays(pays);
        String result = emplacementService.saveDepartement(departement);
        if ("true".equals(result)) {
            reponse.put("message", "Département enregistré avec succès!");
            reponse.put("status", result);
        }
        if ("false".equals(result)) {
            reponse.put("message", "Une erreur est survenue lors de l'enregistrement du Département!");
            reponse.put("status", result);
        }
        if ("exist".equals(result)) {
            reponse.put("message", "Le Département que vous voulez enregistrer existe déjà!");
            reponse.put("status", result);
        }
        return reponse;
    }

    @GetMapping("/commune/{commune}/{id}")
    public JSONObject saveCommune(@PathVariable(value = "commune") String nom, @PathVariable(value = "id") int id) {
        JSONObject reponse = new JSONObject();
        Commune commune = new Commune();
        Departement departement = emplacementService.findDepartementById(id);
        commune.setNom(nom);
        commune.setDepartement(departement);
        String result = emplacementService.saveCommune(commune);
        if ("true".equals(result)) {
            reponse.put("message", "Commune enregistrée avec succès!");
            reponse.put("status", result);
        }
        if ("false".equals(result)) {
            reponse.put("message", "Une erreur est survenue lors de l'enregistrement de la Commune!");
            reponse.put("status", result);
        }
        if ("exist".equals(result)) {
            reponse.put("message", "La commune que vous voulez enregistrer existe déjà!");
            reponse.put("status", result);
        }
        return reponse;
    }

    @GetMapping("/ville/{ville}/{id}")
    public JSONObject saveVille(@PathVariable(value = "ville") String nom, @PathVariable(value = "id") int id) {
        JSONObject reponse = new JSONObject();
        Ville ville = new Ville();
        Commune commune = emplacementService.findCommuneById(id);
        ville.setNom(nom);
        ville.setCommune(commune);
        String result = emplacementService.saveVille(ville);
        if ("true".equals(result)) {
            reponse.put("message", "Ville enregistrée avec succès!");
            reponse.put("status", result);
        }
        if ("false".equals(result)) {
            reponse.put("message", "Une erreur est survenue lors de l'enregistrement de la Ville!");
            reponse.put("status", result);
        }
        if ("exist".equals(result)) {
            reponse.put("message", "La Ville que vous voulez enregistrer existe déjà!");
            reponse.put("status", result);
        }
        return reponse;
    }

    @GetMapping("/quartier/{nom}/{id}")
    public JSONObject saveQuartier(@PathVariable(value = "nom") String nom, @PathVariable(value = "id") int id) {
        JSONObject reponse = new JSONObject();
        Quartier quartier = new Quartier();
        Ville ville = emplacementService.findVilleById(id);
        quartier.setNom(nom);
        quartier.setVille(ville);
        String result = emplacementService.saveQuartier(quartier);
        if ("true".equals(result)) {
            reponse.put("message", "Quartier enregistré avec succès!");
            reponse.put("status", result);
        }
        if ("false".equals(result)) {
            reponse.put("message", "Une erreur est survenue lors de l'enregistrement du Quartier!");
            reponse.put("status", result);
        }
        if ("exist".equals(result)) {
            reponse.put("message", "Le Quartier que vous voulez enregistrer existe déjà!");
            reponse.put("status", result);
        }
        return reponse;
    }
}
