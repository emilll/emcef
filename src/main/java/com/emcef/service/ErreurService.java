/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.Erreur;
import com.emcef.repository.ErreurRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class ErreurService {

    @Autowired
    ErreurRepository erreurRepository;

    public List<Erreur> all() {
        return erreurRepository.findAll();
    }
    
    public Erreur findByErrorCode(String code) {
        return erreurRepository.findByCode(code);
    }
}
