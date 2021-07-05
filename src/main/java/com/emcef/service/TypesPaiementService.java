/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.TypesPaiement;
import com.emcef.repository.TypesPaiementRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class TypesPaiementService {

    @Autowired
    TypesPaiementRepository typesPaiementRepository;

    public List<TypesPaiement> getAll() {
        return typesPaiementRepository.findAll();
    }

}
