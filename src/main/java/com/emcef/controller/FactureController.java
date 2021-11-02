/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Holy
 */
@Controller
public class FactureController {
    
    @GetMapping("/factures")
    public String factures(){
        return "facture/afficher";
    }
    
    @GetMapping("/check")
    public String check(){
        return "verifier/check";
    }
    
    @GetMapping("/rapports")
    public String rapports(){
        return "rapport/resume";
    }
}
