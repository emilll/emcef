/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emcef.model.Contribuable;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Integer> {

    Contribuable findByIfu(String ifu);

    @Query(value = "SELECT _id FROM contribuable WHERE rccm=:rccm", nativeQuery = true)
    int getIdByRccm(@Param("rccm") String rccm);

    Contribuable findByRccm(String rccm);

    @Query(value = "SELECT _id FROM contribuable WHERE nom=:nom", nativeQuery = true)
    int getIdByNom(@Param("nom") String nom);

    Contribuable findByNom(String nom);
    
    List<Contribuable> findAll();
    
    @Query(value = "SELECT *  FROM  contribuable c WHERE c.ifu = :ifu", nativeQuery = true)
    Contribuable findAllByIfu(@Param("ifu") String ifu);
    
    @Query(value = "SELECT count(*)  FROM  contribuable a, installations b, machineinstallees c WHERE  c.id_installation_id = b.id AND b.contribuable_id = a.id AND a.ifu = :ifu", nativeQuery = true)
    int nbreMach(@Param("ifu") String ifu);
    
    @Query(value = "SELECT count(*)  FROM  factureselonspecification c WHERE c.ifuseller = :ifu", nativeQuery = true)
    int nbreFact(@Param("ifu") String ifu);
    
    @Query(value = "SELECT count(*)  FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    int nrbFactNim(@Param("nim") String nim);
    
    @Query(value = "SELECT c.id, date_acivation, date_enregistement, nim, status  FROM  contribuable a, installations b, machineinstallees c WHERE  c.id_installation_id = b.id AND b.contribuable_id = a.id AND a.ifu = :ifu", nativeQuery = true)
    List<JSONObject> allMach(@Param("ifu") String ifu);
}
