/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Contribuable;
import com.emcef.repository.ContribuableRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class ContribuableService {
    @Autowired
    ContribuableRepository contribuableRepository;
    
    public List<Contribuable> getAllContribuable() {
        return contribuableRepository.findAll();
    }

    public void saveContribuable(Contribuable contribuable) {
        this.contribuableRepository.save(contribuable);
    }
    
    public Contribuable getContribuableById(int id){
        Optional<Contribuable> optional = contribuableRepository.findById(id);
        Contribuable contribuable = null;
        if(optional.isPresent()){
            contribuable = optional.get();
        }else{
            throw new RuntimeException("Employé non trouvé pour l'Id :: " + id);
        }
        return contribuable;
    }
    
    public void deleteContribuableById(int id){
        this.contribuableRepository.deleteById(id);
    }

    
}