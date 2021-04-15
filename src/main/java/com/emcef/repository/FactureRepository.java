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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface FactureRepository extends JpaRepository<FactureSelonSpecification, Integer> {

    @Query(value = "SELECT count(*) FROM factureselonspecifiaction n",nativeQuery = true)
    long nbrFact();

    @Query(value = "SELECT sum(total) as totalTTC , sum(total_taxable) as totalTVA FROM factureselonspecifiaction",nativeQuery = true)
    Double getTotalTTC();

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecifiaction",nativeQuery = true)
    Double getTotalTVA();


    @Query(value="SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1", nativeQuery=true)
    int TotalFactureToday(Date date);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE dateheure = ?1",nativeQuery = true)
    Double getTotalTTC(Date date);

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecification WHERE dateheure = ?1",nativeQuery = true)
    Double getTotalTVA(Date date);
    
    @Query(value = "SELECT(sum(total)  + sum(total_taxable)) as total FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    Double getTotal(int year, int month);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    Double TotalMonthTTC(int year, int month);

    @Query(value = "SELECT sum(total) as totalTTC, sum(total_taxable) as totalHT FROM factureselonspecifiaction f WHERE f.ifu =:ifu",nativeQuery = true)
    String getFactTotauxContribuable(@Param("ifu")String ifu);

    @Query(value = "SELECT sum(total) as totalTTC, sum(total_taxable) as totalHT FROM factureselonspecifiaction f WHERE f.ifu =:ifu AND f.dateheure=:d1 ",nativeQuery = true)
    Double getFactTotauxContribuable2(@Param("ifu")String ifu,@Param("d1")String d1);

    @Query(value = "SELECT sum(total) as totalTTC, sum(total_taxable) as totalHT FROM factureselonspecifiaction f WHERE f.ifu =:ifu AND f.dateheure BETWEN :d1 AND :d2 ",nativeQuery = true)
    Double getFactTotauxContribuable3(@Param("ifu")String ifu,@Param("d1")Date d1, @Param("d2")Date d2);

    
    @Query(value = "SELECT sum(total) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3",nativeQuery = true)
    double DayTTC(int year, int month, int day);
    
    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3",nativeQuery = true)
    int DayRapports(int year, int month, int day);
    
    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3",nativeQuery = true)
    int DayFactures(int year, int month, int day);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 ",nativeQuery = true)
    double getBetweenTTC(@Param("d1")Date d1, @Param("d2")Date d2);
    
    @Query(value = "SELECT count(*) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 ",nativeQuery = true)
    double getBetweenFactures(@Param("d1")Date d1, @Param("d2")Date d2);
    
    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 ",nativeQuery = true)
    double getBetweenRapports(@Param("d1")Date d1, @Param("d2")Date d2);
}
