/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.MachinesInstallees;
import com.emcef.model.Machinesenregistrees;
import com.emcef.service.MachineEnregistreService;
import com.emcef.service.MachineService;
import java.util.ArrayList;
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
@RequestMapping("/api")
public class MachineResController {

    @Autowired
    MachineService machineService;
    
    @Autowired
    MachineEnregistreService machineEnregistreService;

    @PostMapping("/saveMachine")
    public JSONObject saveMachine(@RequestBody MachinesInstallees machinesInstallees) {
        JSONObject reponse = new JSONObject();
        boolean test = false;
        int id = 0;
        machineService.saveMachine(machinesInstallees);
        for (MachinesInstallees str : machineService.getAllMachines()) {
            if (str == machinesInstallees) {
                test = true;
                id = str.getId();
            }
        }
        if (test) {
            reponse.put("status", true);
            reponse.put("id", id);
            return reponse;
        } else {
            reponse.put("status", false);
            reponse.put("id", id);
            return reponse;
        }
    }
    
    @PostMapping("/saveMachineEnregistre")
    public JSONObject saveMachineEnregistre(@RequestBody Machinesenregistrees machinesenregistrees) {
        JSONObject reponse = new JSONObject();
        boolean test = false;
        machineEnregistreService.saveMachine(machinesenregistrees);
        for (Machinesenregistrees str : machineEnregistreService.getAllMachines()) {
            if (str == machinesenregistrees) {
                test = true;
            }
        }
        if (test) {
            reponse.put("status", true);
            return reponse;
        } else {
            reponse.put("status", false);
            return reponse;
        }
    }

    @GetMapping("/machineall")
    public List<JSONObject> machines() {
        List<JSONObject> good = new ArrayList();
        for (MachinesInstallees str : machineService.getAllMachines()) {
            JSONObject test = new JSONObject();
            test.put("id", str.getId());
            test.put("nim", str.getNim());
            test.put("date_activation", str.getDate_activation());
            test.put("date_enregistrement", str.getDate_enregistement());
            test.put("status", str.getStatus());
            test.put("nbrFact", machineService.getNbrFactNim(str.getNim()));
            good.add(test);
        }
        return good;
    }

    @GetMapping("/onemachine/{ifu}")
    public List<JSONObject> precisemachine(@PathVariable(value = "ifu") String ifu) {
        List<JSONObject> good = new ArrayList();
        for (MachinesInstallees str : machineService.getAllMachines()) {
            if (str.getId_installation().getIfuseller() == ifu) {
                JSONObject test = new JSONObject();
                test.put("id", str.getId());
                test.put("nim", str.getNim());
                test.put("date_activation", str.getDate_activation());
                test.put("date_enregistrement", str.getDate_enregistement());
                test.put("status", str.getStatus());
                test.put("nbrFact", machineService.getNbrFactNim(str.getNim()));
                good.add(test);
            }
        }
        return good;
    }

    @GetMapping("/machineinfo/{nim}")
    public MachinesInstallees findIfu(@PathVariable(value = "nim") String nim) {
        return machineService.findAllByNim(nim);
    }

    @GetMapping("/factures/{nim}")
    public List<JSONObject> findFact(@PathVariable(value = "nim") String nim) {
        return machineService.allFact(nim);
    }

    @GetMapping("/moreinfo/{nim}")
    public JSONObject moreinfo(@PathVariable(value = "nim") String nim) {
        JSONObject resultat = new JSONObject();
        resultat.put("rapports", machineService.totalRapport(nim));
        resultat.put("factures", machineService.totalFactures(nim));
        resultat.put("totalHT", machineService.totalHT(nim));
        resultat.put("totalTTC", machineService.totalTTC(nim));
        return resultat;
    }

    @GetMapping("/findmachinebyenim/{enim}")
    public MachinesInstallees getByIfu(@PathVariable(value = "enim") String enim) {
        MachinesInstallees test = machineService.findAllByNim(enim);
        try {
            if (test != null) {
                return test;
            } else {
                return new MachinesInstallees();
            }
        } catch (Exception e) {
            return new MachinesInstallees();
        }
    }
}
