/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.FactureNormalisee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface FactureNormaliseeRepository extends JpaRepository<FactureNormalisee, Integer> {
    public FactureNormalisee findAllById(int id);

    public FactureNormalisee findByCodemecefdgi(String code);
    
}
