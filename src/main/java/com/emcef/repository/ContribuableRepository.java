/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emcef.model.Contribuable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Integer> {

    @Query(value = "SELECT _id FROM contribuable WHERE ifu=:ifu", nativeQuery = true)
    int getIdByIfu(@Param("ifu") String ifu);

    Contribuable findByIfu(String ifu);

    @Query(value = "SELECT _id FROM contribuable WHERE rccm=:rccm", nativeQuery = true)
    int getIdByRccm(@Param("rccm") String rccm);

    Contribuable findByRccm(String rccm);

    @Query(value = "SELECT _id FROM contribuable WHERE nom=:nom", nativeQuery = true)
    int getIdByNom(@Param("nom") String nom);

    Contribuable findByNom(String nom);

}
