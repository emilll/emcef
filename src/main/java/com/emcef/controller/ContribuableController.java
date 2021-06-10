/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Contribuable;
import com.emcef.service.ContribuableService;
import com.emcef.utility.JWTUtility;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import javax.servlet.http.HttpServletRequest;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Holy
 */
@Controller
public class ContribuableController {

    @Autowired
    ContribuableService contribuableService;

    @GetMapping("/ajoutercontribuable")
    public String show(Model model) {
        Contribuable contribuable = new Contribuable();
        model.addAttribute("contribuable", contribuable);
        model.addAttribute("afficher", contribuableService.getAllContribuable());
        return "/contribuable/ajouter";
    }

    @GetMapping("/contribuables")
    public String all() {
        return "/contribuable/afficher";
    }

    @GetMapping("/contribuable/{ifu}")
    public String one(@PathVariable(value = "ifu") String ifu) {
        return "/contribuable/info";
    }

    @GetMapping("/showdayinfo/{date}")
    public String dayinfo(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return "dayinfo";
    }

    @PostMapping("/savecontribuable")
    public String SaveContribuable(@ModelAttribute("contribuable") Contribuable contribuable) {
        contribuableService.saveContribuable(contribuable);
        return "redirect:/ajoutercontribuable";
    }

    /*@GetMapping("/modifiercontribuable/{id}")
    public String viewPage(@PathVariable(value = "id") int id, Model model) {
        Contribuable contribuable = contribuableService.getContribuableById(id);
        model.addAttribute("contribuable", contribuable);
        return "contribuable/modifier";
    }*/
    @GetMapping("/deletecontribuable/{id}")
    public String delete(@PathVariable(value = "id") int id, Model model) {
        this.contribuableService.deleteContribuableById(id);
        return "redirect:/showcontribuable";
    }

    // rechercher et retourner les informations d'un contribuable par son ifu
    @GetMapping("/getcontribuablebyifu/{ifu}")
    public Contribuable getContribuableByIfu(Model model, @PathVariable(value = "ifu") String ifu) {
        Contribuable contribuable = contribuableService.findContribuableByIfu(ifu);
        model.addAttribute("contribuable", contribuable);
        return null;
    }
}
