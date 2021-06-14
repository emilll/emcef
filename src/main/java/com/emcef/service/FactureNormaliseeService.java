/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.FactureNormalisee;
import com.emcef.repository.FactureNormaliseeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class FactureNormaliseeService {
    
    @Autowired
    FactureNormaliseeRepository factureNormaliseeRepository;
    
    public FactureNormalisee byId(int id){
    return factureNormaliseeRepository.findAllById(id);
    }
}
