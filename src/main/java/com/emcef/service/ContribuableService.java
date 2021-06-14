/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Contribuable;
import com.emcef.repository.ContribuableRepository;
import java.util.List;
import org.json.simple.JSONObject;
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
    
    public int nrbMach(String ifu) {
        return contribuableRepository.nbreMach(ifu);
    }
    
    public Contribuable findAllByIfu(String ifu) {
        return contribuableRepository.findAllByIfu(ifu);
    }
    
    public int nrbFact(String ifu) {
        return contribuableRepository.nbreFact(ifu);
    }
    
    public int nrbFactNim(String nim) {
        return contribuableRepository.nrbFactNim(nim);
    }

    public void deleteContribuableById(int id) {
        this.contribuableRepository.deleteById(id);
    }

    public Contribuable findContribuableByIfu(String ifu) {
        return contribuableRepository.findByIfu(ifu);
    }

    public Contribuable findContribuableByRccm(String rccm) {
        return contribuableRepository.findByRccm(rccm);
    }

    public Contribuable findContribuableByNom(String nom) {
        return contribuableRepository.findByNom(nom);
    }
    
    public List<JSONObject> allMach(String ifu){
        return contribuableRepository.allMach(ifu);
    }

    // **********************service des API DEBUT*********************
    public Contribuable getByIfu(String ifu) {
        return contribuableRepository.findByIfu(ifu);
    }

    public int getIdByRccm(String rccm) {
        return contribuableRepository.getIdByRccm(rccm);
    }

    public int getIdByNom(String nom) {
        return contribuableRepository.getIdByNom(nom);
    }

    // **********************service des API FIN*********************

}