/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import java.util.List;
import java.util.Optional;

import com.emcef.model.Typesmachines;
import com.emcef.repository.TypesmachinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class TypesmachinesService {

    @Autowired
    private TypesmachinesRepository typesmachinesRepository;

    public List<Typesmachines> getAlltypes() {
        return typesmachinesRepository.findAll();
    }

    public void saveTypesmachines(Typesmachines typesmachines) {
        this.typesmachinesRepository.save(typesmachines);
    }

    public Typesmachines getTypesmachinesById(Long id) {
        Optional<Typesmachines> optional = typesmachinesRepository.findById(id);
        Typesmachines typesmachines = null;
        if (optional.isPresent()) {
            typesmachines = optional.get();
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return typesmachines;
    }


    public Typesmachines supTypesmachinesById(Long id) {

        Optional<Typesmachines> optional = typesmachinesRepository.findById(id);
        Typesmachines typesmachines = null;
        if (optional.isPresent()) {
            typesmachinesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return typesmachines;
    }
    

    
    public void modTypesmachines(Typesmachines typesmachines) {
        this.typesmachinesRepository.save(typesmachines);
    }
}