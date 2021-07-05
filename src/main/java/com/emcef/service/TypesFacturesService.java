/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.TypesFactures;
import com.emcef.repository.TypesFacturesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class TypesFacturesService {

    @Autowired
    TypesFacturesRepository typesFacturesRepository;

    public List<TypesFactures> getAll() {
        return typesFacturesRepository.findAll();
    }

}
