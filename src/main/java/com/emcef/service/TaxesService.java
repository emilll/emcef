/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.TaxeGroupes;
import com.emcef.repository.TaxesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class TaxesService {

    @Autowired
    TaxesRepository taxesRepository;

    public TaxeGroupes findAllById(Long id) {
        return taxesRepository.findAllById(id);
    }
}
