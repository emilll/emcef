/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Contribuable.Contribuables;
import com.emcef.repository.ContribuableRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class ContribuableServiceImpl {
    @Autowired
    ContribuableRepository contribuableRepository;
    
    public List<Contribuables> getAllContribuable() {
        return contribuableRepository.findAll();
    }

    public void saveContribuable(Contribuables contribuable) {
        this.contribuableRepository.save(contribuable);
    }
    
}