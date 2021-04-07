/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.restcontroller;
import com.emcef.service.FactureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Em
 */
@RestController
@RequestMapping("/api")
public class TableaudeBordController {

    @Autowired
    FactureService factureService;

    @GetMapping("/totalttc")
    public Double getTotalTTC() {
        return factureService.totalTTC();
    }

    @GetMapping("/totaltva")
    public Double getTotalTVA() {
        return factureService.totalTVA();
    }

    @GetMapping("/nbrfacture")
    public long countfacture() {
        return factureService.countfacture();
    }

    // @GetMapping("/")
    // public String Accueil(Model model) {
    // model.addAttribute("facture",
    // factureService.getAllFactureSelonSpecification());
    // return "index";
    // }

    // @GetMapping("/savefacture")
    // public String FactureSelonSpecification(Model model) {
    // FactureSelonSpecification facture = new FactureSelonSpecification();
    // model.addAttribute("facture", facture);
    // return "facture/ajouter";
    // }

    // @GetMapping("/showfacture")
    // public String show(Model model){
    // model.addAttribute("facture",
    // factureService.getAllFactureSelonSpecification());
    // return "facture/afficher";
    // }

    // @PostMapping("/savefacture")
    // public String SaveFactureSelonSpecification(@ModelAttribute("facture")
    // FactureSelonSpecification facture) {
    // factureService.saveFactureSelonSpecification(facture);
    // return "redirect:/showfacture";
    // }

    // @GetMapping("/modifierfacture/{id}")
    // public String viewPage(@PathVariable(value = "id") Long id, Model model){
    // FactureSelonSpecification facture =
    // factureService.getFactureSelonSpecificationById(id);
    // model.addAttribute("facture", facture);
    // return "facture/modifier";
    // }

    // @GetMapping("/deletefacture/{id}")
    // public String delete(@PathVariable(value = "id") Long id, Model model){
    // this.factureService.deleteFactureSelonSpecificationById(id);
    // return "redirect:/showfacture";
    // }

}