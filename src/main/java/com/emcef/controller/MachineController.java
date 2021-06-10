/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Machinesenregistrees;
import com.emcef.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Holy
 */
@Controller
public class MachineController {
    
    @GetMapping("/machines")
    public String all() {
        return "/machine/afficher";
    }
    
    @GetMapping("/machine/{nim}")
    public String one(@PathVariable(value = "nim") String nim) {
        return "/machine/info";
    }
   
}
