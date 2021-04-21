package com.emcef.repository;

import java.util.Date;

import com.emcef.model.FactureSelonSpecification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TBEntrepriseRepository extends JpaRepository<FactureSelonSpecification , Integer> {

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
    
}
