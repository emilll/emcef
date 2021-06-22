/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.service.FactureService;
import com.emcef.service.RapportService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class IndexResController {

    @Autowired
    FactureService factureService;

    @Autowired
    RapportService rapportService;

    @GetMapping("/banniere")
    public JSONObject machines() {
        JSONObject good = new JSONObject();
        int waiting = 0, done = 0;
        for (FactureSelonSpecification str : factureService.getAllFactureSelonSpecification()) {
            if (str.getStatus()) {
                done++;
            } else {
                waiting++;
            }
        }
        good.put("attente", waiting);
        good.put("traités", done);
        good.put("rapports", rapportService.all().size());
        return good;
    }
}
