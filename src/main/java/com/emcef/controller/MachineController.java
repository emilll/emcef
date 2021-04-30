/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Machinesenregistrees;
import com.emcef.service.MachinesenregistreesService;
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
public class MachineController {
    @Autowired
    MachinesenregistreesService machineService;

    @GetMapping("/savemachine")
    public String Contribuable(Model model) {
        Machinesenregistrees machine = new Machinesenregistrees();
        model.addAttribute("machine", machine);
        return "machine/ajouter";
    }
    
    @GetMapping("/showmachines")
    public String show(Model model){
    model.addAttribute("machine", machineService.getAllMachinesenregistrees());
    return "machine/afficher";
    }
    
    @PostMapping("/savemachine")
    public String SaveContribuable(@ModelAttribute("machine") Machinesenregistrees machine) {
        machineService.saveMachinesenregistrees(machine);
        return "redirect:/showmachines";
    }
    
    @GetMapping("/modifiermachine/{id}")
    public String viewPage(@PathVariable(value = "id") long id, Model model){
        Machinesenregistrees machine = machineService.getMachinesenregistreesById(id);
        model.addAttribute("machine", machine);
        return "machine/modifier";
    }
    
    @GetMapping("/deletemachine/{id}")
    public String delete(@PathVariable(value = "id") long id, Model model){
        this.machineService.supMachinesenregistreesById(id);
        return "redirect:/showmachines";
    }
    
    @GetMapping("/InfoMachine/{id}")
    public String info(@PathVariable(value = "id") String id){
    return "/informations/MachineInfo";
    }
}
