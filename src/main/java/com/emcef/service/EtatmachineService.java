/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import java.util.List;
import java.util.Optional;

import com.emcef.model.Etatmachine;
import com.emcef.repository.EtatmachineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class EtatmachineService {

    @Autowired
    private EtatmachineRepository machinesenregistreesRepository;

    public List<Etatmachine> getAlltypes() {
        return machinesenregistreesRepository.findAll();
    }

    public void saveEtatmachine(Etatmachine machinesenregistrees) {
        this.machinesenregistreesRepository.save(machinesenregistrees);
    }

    public Etatmachine getEtatmachineById(Long id) {
        Optional<Etatmachine> optional = machinesenregistreesRepository.findById(id);
        Etatmachine machinesenregistrees = null;
        if (optional.isPresent()) {
            machinesenregistrees = optional.get();
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return machinesenregistrees;
    }


    public Etatmachine supEtatmachineById(Long id) {

        Optional<Etatmachine> optional = machinesenregistreesRepository.findById(id);
        Etatmachine machinesenregistrees = null;
        if (optional.isPresent()) {
            machinesenregistreesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return machinesenregistrees;
    }
    

    
    public void modEtatmachine(Etatmachine machinesenregistrees) {
        this.machinesenregistreesRepository.save(machinesenregistrees);
    }
}