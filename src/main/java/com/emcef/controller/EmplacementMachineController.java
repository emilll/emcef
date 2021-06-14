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
public class EmplacementMachineController {
    @GetMapping("/enregistrer-emplacement-machines")
    public String Machine(Model model){
        //model.addAttribute("people", employeeService.getAllEmployees());
        return "machine";
    }
    
    @GetMapping("/saveplace")
    public String place(){
        return "emplacement/save";
    }
}
