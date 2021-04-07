/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Modelsmachines;
import com.emcef.service.ModelsmachinesService;
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
public class ModelsmachinesController {
    @Autowired
    ModelsmachinesService modeleService;

    @GetMapping("/savemodele")
    public String Contribuable(Model model) {
       Modelsmachines modele = new Modelsmachines();
        model.addAttribute("modele", modele);
        return "modele/ajouter";
    }
    
    @GetMapping("/showmodeles")
    public String show(Model model){
    model.addAttribute("modele", modeleService.getAlltypes());
    return "modele/afficher";
    }
    
    @PostMapping("/savemodele")
    public String SaveContribuable(@ModelAttribute("modele") Modelsmachines modele) {
        modeleService.saveModelsmachines(modele);
        return "redirect:/showmodele";
    }
    
    @GetMapping("/modifiermodele/{id}")
    public String viewPage(@PathVariable(value = "id") int id, Model model){
        Modelsmachines modele = modeleService.getModelsmachinesById(id);
        model.addAttribute("modele", modele);
        return "modele/modifier";
    }
    
    @GetMapping("/deletemodele/{id}")
    public String delete(@PathVariable(value = "id") int id, Model model){
        this.modeleService.deleteModelsmachinesById(id);
        return "redirect:/showmodeles";
    }
}
