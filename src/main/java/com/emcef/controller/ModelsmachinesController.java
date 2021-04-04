/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Holy
 */
@Controller
public class ModelsmachinesController {
    @GetMapping("/enregistrer-modeles")
    public String Modeles(Model model){
        //model.addAttribute("people", employeeService.getAllEmployees());
        return "modele";
    }
}
