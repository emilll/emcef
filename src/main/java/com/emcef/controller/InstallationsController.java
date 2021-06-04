/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.service.InstallationsService;
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
public class InstallationsController {
    @Autowired
    InstallationsService installationsservice;
    
    @GetMapping("/InfoPointDeVente/{id}")
    public String info(@PathVariable(value = "id") String id){
    return "/informations/PointDeVenteInfo";
    }
    
    @GetMapping("/installations")
    public String all() {
        return "/seller/afficher";
    }
    
    @GetMapping("/installation/{id}")
    public String one(@PathVariable(value = "id") String id) {
        return "/seller/info";
    }
}
