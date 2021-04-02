/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Fabricant;
import com.emcef.service.FabricantService;
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
public class FabricantController {
    @Autowired
    FabricantService fabricantService;

    @GetMapping("/savefabricant")
    public String Fabricant(Model model) {
        Fabricant fabricant = new Fabricant();
        model.addAttribute("fabricant", fabricant);
        return "fabricant/ajouter";
    }
    
    @GetMapping("/showfabricants")
    public String show(Model model){
    model.addAttribute("fabricant", fabricantService.getAllFabricant());
    return "fabricant/afficher";
    }
    
    @PostMapping("/savefabricant")
    public String SaveFabricant(@ModelAttribute("fabricant") Fabricant fabricant) {
        fabricantService.saveFabricant(fabricant);
        return "redirect:/showfabricants";
    }
    
    @GetMapping("/modifierfabricant/{id}")
    public String viewPage(@PathVariable(value = "id") int id, Model model){
        Fabricant fabricant = fabricantService.getFabricantById(id);
        model.addAttribute("fabricant", fabricant);
        return "fabricant/modifier";
    }
    
    @GetMapping("/deletefabricant/{id}")
    public String delete(@PathVariable(value = "id") int id, Model model){
        this.fabricantService.deleteFabricantById(id);
        return "redirect:/showfabricants";
    }
}
