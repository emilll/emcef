/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import java.util.List;
import java.util.Optional;

import com.emcef.model.Modelsmachines;
import com.emcef.repository.ModelsmachinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class ModelsmachinesService {

    @Autowired
    private ModelsmachinesRepository typesmachinesRepository;

    public List<Modelsmachines> getAlltypes() {
        return typesmachinesRepository.findAll();
    }

    public void saveModelsmachines(Modelsmachines typesmachines) {
        this.typesmachinesRepository.save(typesmachines);
    }

    public Modelsmachines getModelsmachinesById(int id) {
        Optional<Modelsmachines> optional = typesmachinesRepository.findById(id);
        Modelsmachines typesmachines = null;
        if (optional.isPresent()) {
            typesmachines = optional.get();
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return typesmachines;
    }


    public Modelsmachines deleteModelsmachinesById(int id) {

        Optional<Modelsmachines> optional = typesmachinesRepository.findById(id);
        Modelsmachines typesmachines = null;
        if (optional.isPresent()) {
            typesmachinesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return typesmachines;
    }
    

    
    public void modModelsmachines(Modelsmachines typesmachines) {
        this.typesmachinesRepository.save(typesmachines);
    }
}