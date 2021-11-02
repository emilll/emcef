/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.MachinesInstallees;
import com.emcef.model.User;
import com.emcef.repository.UserRepository;
import com.emcef.service.FactureService;
import com.emcef.service.MachineService;
import com.emcef.service.RapportService;
import java.util.Date;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    UserRepository userRepository;

    @Autowired
    RapportService rapportService;

    @Autowired
    MachineService machineService;

    @PostMapping(value = "/check", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public JSONObject verification(@RequestParam String username, @RequestParam String password) {
        System.out.println(username + ' ' +password);
        JSONObject resultat = new JSONObject();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        User utilisateur = new User();
        try {
            utilisateur = userRepository.findByUsername(username);
            if (encoder.matches(password, utilisateur.getPassword())) {
                resultat.put("auth", true);
                resultat.put("ifu", utilisateur.getIfu());
            } else {
                resultat.put("auth", false);
            }
            return resultat;
        } catch (Exception e) {
            resultat.put("auth", false);
            return resultat;
        }
    }

    // @PostMapping(value = "/check", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ResponseBody
    // public User verification(@RequestBody String username) {
    //     User utilisateur = new User();
    //     utilisateur = userRepository.findByUsername(username);
    //     if (utilisateur != null) {
    //         return utilisateur;
    //     } else {
    //         return new User();
    //     }
    // }

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
                if (now.getDate() - str.getDate_heure().getDate() < 7) {
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
