/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.TaxeGroupes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface TaxesRepository extends JpaRepository<TaxeGroupes, Long> {
    TaxeGroupes findAllById(Long id);
}
