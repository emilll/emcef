/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.FactureSelonSpecification;

import com.emcef.repository.FactureSelonSpecificationRepository;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EM
 */
@Service
public class FactureService {
    @Autowired
   FactureSelonSpecificationRepository factureRep;
    
    
    
    public void deleteFactureSelonSpecificationById(Long id){
        this.factureRep.deleteById(id);
    }

    public Double totalTTC(){
        return factureRep.getTotalTTC();
    }

    public Double totalTVA(){
        return factureRep.getTotalTVA();
    }

    public Long countfacture(){
        return factureRep.nbrFact();
    }
    




    public List<FactureSelonSpecification> getAllFactureSelonSpecification() {
        return factureRep.findAll();
    }

    public void saveFactureSelonSpecification(FactureSelonSpecification fabricant) {
        this.factureRep.save(fabricant);
    }
    
    public FactureSelonSpecification getFactureSelonSpecificationById(Long id){
        Optional<FactureSelonSpecification> optional = factureRep.findById(id);
        FactureSelonSpecification fabricant = null;
        if(optional.isPresent()){
            fabricant = optional.get();
        }else{
            throw new RuntimeException("Employé non trouvé pour l'Id :: " + id);
        }
        return fabricant;
    }
}
