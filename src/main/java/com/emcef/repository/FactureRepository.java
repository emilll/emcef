/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import com.emcef.model.FactureSelonSpecification;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface FactureRepository extends JpaRepository<FactureSelonSpecification, Integer> {

    @Query(value="SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1", nativeQuery=true)
    int TotalFactureToday(Date date);
}
