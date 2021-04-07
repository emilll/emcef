/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;


import com.emcef.model.FactureSelonSpecification;
import com.emcef.repository.FactureSelonSpecificationRepository;

import org.springframework.stereotype.Service;



/**
 *
 * @author EM
 */
@Service
public class FactureSelonSpecificationService {
    // @Autowired
    private FactureSelonSpecificationRepository facture;

    public long countfacture() {
        return facture.countFact();
    }

    public FactureSelonSpecification total() {
        System.out.println("total : "+facture.getTotalTTC());
        return facture.getTotalTTC();
    }

    // public void saveFactureSelonSpecification(FactureSelonSpecification
    // factureselonspecification) {
    // this.facture.save(factureselonspecification);
    // }

    // public FactureSelonSpecification getFactureSelonSpecificationById(int id){
    // Optional<FactureSelonSpecification> optional =
    // facture.findById(id);
    // FactureSelonSpecification factureselonspecification = null;
    // if(optional.isPresent()){
    // factureselonspecification = optional.get();
    // }else{
    // throw new RuntimeException("Employé non trouvé pour l'Id :: " + id);
    // }
    // return factureselonspecification;
    // }

    // public void deleteFactureSelonSpecificationById(int id){
    // this.facture.deleteById(id);
    // }
}
