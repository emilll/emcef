/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.TypesPaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface TypesPaiementRepository extends JpaRepository<TypesPaiement, Long> {
    
}
