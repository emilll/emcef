/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Contribuable.Contribuables;
import com.emcef.service.ContribuableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Holy
 */
@Controller
public class ContribuableController {

    @Autowired
    ContribuableServiceImpl contribuableService;

    @GetMapping("/")
    public String Accueil(Model model) {
        model.addAttribute("contribuable", contribuableService.getAllContribuable());
        return "index";
    }

    @GetMapping("/enregistrer-contribuable")
    public String Contribuable(Model model) {
        Contribuables contribuable = new Contribuables();
        model.addAttribute("contribuable", contribuable);
        return "contribuable";
    }
    
    @GetMapping("/save_contribuable")
    public String SaveContribuable(@ModelAttribute("contribuable") Contribuables contribuable) {
        contribuableService.saveContribuable(contribuable);
        return "redirect:/";
    }
}