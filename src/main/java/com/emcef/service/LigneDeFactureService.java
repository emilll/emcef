/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import com.emcef.repository.LigneDeFactureRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class LigneDeFactureService {

    @Autowired
    LigneDeFactureRepository ligneDeFactureRepository;

    public List<LigneDeFacture> articles(FactureSelonSpecification facture) {
        return ligneDeFactureRepository.findByFacture(facture);
    }

    public void saveArticle(LigneDeFacture article) {
        ligneDeFactureRepository.save(article);
    }
}
