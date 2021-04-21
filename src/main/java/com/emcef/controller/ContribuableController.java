/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Contribuable;
import com.emcef.service.ContribuableService;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/")
    public String Accueil(Model model) {
        model.addAttribute("contribuable", contribuableService.getAllContribuable());
        return "index";
    }

    @GetMapping("/savecontribuable")
    public String Contribuable(Model model) {
        Contribuable contribuable = new Contribuable();
        model.addAttribute("contribuable", contribuable);
        return "contribuable/ajouter";
    }
    
    @GetMapping("/showcontribuable")
    public String show(Model model){
    model.addAttribute("contribuable", contribuableService.getAllContribuable());
    return "contribuable/afficher";
    }
    
    @PostMapping("/savecontribuable")
    public String SaveContribuable(@ModelAttribute("contribuable") Contribuable contribuable) {
        contribuableService.saveContribuable(contribuable);
        return "redirect:/showcontribuable";
    }
    
    @GetMapping("/modifiercontribuable/{id}")
    public String viewPage(@PathVariable(value = "id") int id, Model model){
        Contribuable contribuable = contribuableService.getContribuableById(id);
        model.addAttribute("contribuable", contribuable);
        return "contribuable/modifier";
    }
    
    @GetMapping("/deletecontribuable/{id}")
    public String delete(@PathVariable(value = "id") int id, Model model){
        this.contribuableService.deleteContribuableById(id);
        return "redirect:/showcontribuable";
    }
}