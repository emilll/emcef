/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface QuartierRepository extends JpaRepository <Quartier, Integer> {

    public Quartier findAllByNom(String nom);

    public Quartier findAllById(int id);
    
}
