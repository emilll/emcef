/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface LigneDeFactureRepository extends JpaRepository<LigneDeFacture, Integer> {
    List<LigneDeFacture> findByFacture(FactureSelonSpecification facture);
}
