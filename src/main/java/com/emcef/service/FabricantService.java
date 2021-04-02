/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Fabricant;
import com.emcef.repository.FabricantRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class FabricantService {
    @Autowired
   FabricantRepository fabricantRepository;
    
    public List<Fabricant> getAllFabricant() {
        return fabricantRepository.findAll();
    }

    public void saveFabricant(Fabricant fabricant) {
        this.fabricantRepository.save(fabricant);
    }
    
    public Fabricant getFabricantById(int id){
        Optional<Fabricant> optional = fabricantRepository.findById(id);
        Fabricant fabricant = null;
        if(optional.isPresent()){
            fabricant = optional.get();
        }else{
            throw new RuntimeException("Employé non trouvé pour l'Id :: " + id);
        }
        return fabricant;
    }
    
    public void deleteFabricantById(int id){
        this.fabricantRepository.deleteById(id);
    }
}
