/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import java.util.List;
import java.util.Optional;

import com.emcef.model.Machinesenregistrees;
import com.emcef.repository.MachinesenregistreesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class MachinesenregistreesService {

    @Autowired
    private MachinesenregistreesRepository machinesenregistreesRepository;

    public List<Machinesenregistrees> getAlltypes() {
        return machinesenregistreesRepository.findAll();
    }

    public void saveMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
        this.machinesenregistreesRepository.save(machinesenregistrees);
    }

    public Machinesenregistrees getMachinesenregistreesById(Long id) {
        Optional<Machinesenregistrees> optional = machinesenregistreesRepository.findById(id);
        Machinesenregistrees machinesenregistrees = null;
        if (optional.isPresent()) {
            machinesenregistrees = optional.get();
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return machinesenregistrees;
    }


    public Machinesenregistrees supMachinesenregistreesById(Long id) {

        Optional<Machinesenregistrees> optional = machinesenregistreesRepository.findById(id);
        Machinesenregistrees machinesenregistrees = null;
        if (optional.isPresent()) {
            machinesenregistreesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return machinesenregistrees;
    }
    

    
    public void modMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
        this.machinesenregistreesRepository.save(machinesenregistrees);
    }
}