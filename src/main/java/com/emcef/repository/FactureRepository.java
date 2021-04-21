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
    
    //Interface Générale

    @Query(value="SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1", nativeQuery=true)
    int TotalFactureToday(Date date);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE dateheure = ?1",nativeQuery = true)
    Double getTotalTTC(Date date);

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecification WHERE dateheure = ?1",nativeQuery = true)
    Double getTotalTVA(Date date);
    
    @Query(value = "SELECT(sum(total)  + sum(total_taxable)) as total FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    Double getTotal(int year, int month);
    
    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    int factureMonth(int year, int month);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2",nativeQuery = true)
    Double TotalMonthTTC(int year, int month);
    
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
    
    //Interface Entreprise
    
    @Query(value="SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2", nativeQuery=true)
    int EntTotalFactureToday(Date date, int ifu);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2",nativeQuery = true)
    Double EntGetTotalTTC(Date date, int ifu);

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2",nativeQuery = true)
    Double EntGetTotalTVA(Date date, int ifu);
    
    @Query(value = "SELECT(sum(total)  + sum(total_taxable)) as total FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3",nativeQuery = true)
    Double EntGetTotal(int year, int month, int ifu);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3",nativeQuery = true)
    Double EntTotalMonthTTC(int year, int month, int ifu);
    
    @Query(value = "SELECT sum(total) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3  AND ifu = ?4",nativeQuery = true)
    double EntDayTTC(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4",nativeQuery = true)
    int EntDayRapports(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4",nativeQuery = true)
    int EntDayFactures(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double EntGetBetweenTTC(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
    
    @Query(value = "SELECT count(*) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double EntGetBetweenFactures(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
    
    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double EntGetBetweenRapports(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
    
    //Interface Machines
    
    @Query(value="SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2", nativeQuery=true)
    int MachTotalFactureToday(Date date, int ifu);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2",nativeQuery = true)
    Double MachGetTotalTTC(Date date, int ifu);

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2",nativeQuery = true)
    Double MachGetTotalTVA(Date date, int ifu);
    
    @Query(value = "SELECT(sum(total)  + sum(total_taxable)) as total FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3",nativeQuery = true)
    Double MachGetTotal(int year, int month, int ifu);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3",nativeQuery = true)
    Double MachTotalMonthTTC(int year, int month, int ifu);
    
    @Query(value = "SELECT sum(total) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4",nativeQuery = true)
    double MachDayTTC(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4",nativeQuery = true)
    int MachDayRapports(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4",nativeQuery = true)
    int MachDayFactures(int year, int month, int day, int ifu);
    
    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double MachGetBetweenTTC(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
    
    @Query(value = "SELECT count(*) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double MachGetBetweenFactures(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
    
    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3",nativeQuery = true)
    double MachGetBetweenRapports(@Param("d1")Date d1, @Param("d2")Date d2, @Param("d3")int d3);
}
