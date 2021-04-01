/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import java.util.List;
import java.util.Optional;

import com.emcef.model.Fabriquantapprouvees;
import com.emcef.repository.FabriquantapprouveesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class FabriquantapprouveesService {

    @Autowired
    private FabriquantapprouveesRepository fabriquantapprouveesRepository;

    public List<Fabriquantapprouvees> getAlltypes() {
        return fabriquantapprouveesRepository.findAll();
    }

    public void saveFabriquantapprouvees(Fabriquantapprouvees fabriquantapprouvees) {
        this.fabriquantapprouveesRepository.save(fabriquantapprouvees);
    }

    public Fabriquantapprouvees getFabriquantapprouveesById(Long id) {
        Optional<Fabriquantapprouvees> optional = fabriquantapprouveesRepository.findById(id);
        Fabriquantapprouvees fabriquantapprouvees = null;
        if (optional.isPresent()) {
            fabriquantapprouvees = optional.get();
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return fabriquantapprouvees;
    }


    public Fabriquantapprouvees supFabriquantapprouveesById(Long id) {

        Optional<Fabriquantapprouvees> optional = fabriquantapprouveesRepository.findById(id);
        Fabriquantapprouvees fabriquantapprouvees = null;
        if (optional.isPresent()) {
            fabriquantapprouveesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Types machinese not found for id :: " + id);

        }
        return fabriquantapprouvees;
    }
    

    
    public void modFabriquantapprouvees(Fabriquantapprouvees fabriquantapprouvees) {
        this.fabriquantapprouveesRepository.save(fabriquantapprouvees);
    }
}