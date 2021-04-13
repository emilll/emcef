/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;


import com.emcef.model.Rapportcr;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface RapportRepository extends JpaRepository<Rapportcr, Integer>{
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE dateheure = ?1", nativeQuery = true)
    int nbrRapport(Date date);
}
