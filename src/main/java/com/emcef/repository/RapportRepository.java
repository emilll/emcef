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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface RapportRepository extends JpaRepository<Rapportcr, Integer>{
    //Interface Générale
    
    @Query(value = "SELECT count(*) FROM  rapportcr", nativeQuery = true)
    int totalRapport();
    
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE EXTRACT( YEAR FROM dateheure) =:year AND EXTRACT( MONTH FROM dateheure) =:month AND EXTRACT( DAY FROM dateheure) =:day", nativeQuery = true)
    int nbrRapport(@Param("year") int year ,@Param("month") int month,@Param("day") int day);
    
    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    int MonthRapports(int year, int month);
    
    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 ",nativeQuery = true)
    double getBetweenRapports(@Param("d1")Date d1, @Param("d2")Date d2);
    
    //Interface Entreprise
    
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE dateheure = ?1 AND ifu = ?2", nativeQuery = true)
    int nbrEntRapport(Date date, int ifu);
    
    //Interface Machines
    
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE dateheure = ?1", nativeQuery = true)
    int nbrMachRapport(Date date);
}
