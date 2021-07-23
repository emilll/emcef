/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.MachinesInstallees;
import com.emcef.service.FactureService;
import com.emcef.service.MachineService;
import com.emcef.service.RapportService;
import java.util.Date;
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

    @Autowired
    MachineService machineService;

    @GetMapping("/banniere")
    public JSONObject machines() {
        Date now = new Date();
        JSONObject good = new JSONObject();
        int waiting = 0, done = 0, connected = 0;
        for (FactureSelonSpecification str : factureService.getAllFactureSelonSpecification()) {
            if (str.getStatus()) {
                done++;
            } else {
                waiting++;
            }
        }

        for (MachinesInstallees str : machineService.getAllMachines()) {
            try {
                if (now.getDate() - str.getDate_heure().getDate() < 2) {
                    connected++;
                }
            } catch (Exception e) {
            }
        }

        good.put("attente", waiting);
        good.put("traités", done);
        good.put("connected", connected);
        good.put("rapports", rapportService.all().size());
        return good;
    }
}
