/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emcef.model.Contribuable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Integer> {

    @Query(value = "SELECT id FROM contribuable WHERE ifu=:ifu", nativeQuery = true)
    int getIdByIfu(int ifu);

    Contribuable findByIfu(int ifu);

    @Query(value = "SELECT id FROM contribuable WHERE rccm=:rccm", nativeQuery = true)
    int getIdByRccm(String rccm);

    Contribuable findByRccm(String rccm);

    @Query(value = "SELECT id FROM contribuable WHERE nom=:nom", nativeQuery = true)
    int getIdByNom(String nom);

    Contribuable findByNom(String nom);

}
