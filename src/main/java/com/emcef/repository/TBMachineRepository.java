package com.emcef.repository;

import java.util.Date;

import com.emcef.model.FactureSelonSpecification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TBMachineRepository extends JpaRepository<FactureSelonSpecification, Integer> {

    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2", nativeQuery = true)
    int MachTotalFactureToday(Date date, int ifu);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2", nativeQuery = true)
    Double MachGetTotalTTC(Date date, int ifu);

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecification WHERE dateheure = ?1 AND ifu = ?2", nativeQuery = true)
    Double MachGetTotalTVA(Date date, int ifu);

    @Query(value = "SELECT(sum(total)  + sum(total_taxable)) as total FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3", nativeQuery = true)
    Double MachGetTotal(int year, int month, int ifu);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2 AND ifu = ?3", nativeQuery = true)
    Double MachTotalMonthTTC(int year, int month, int ifu);

    @Query(value = "SELECT sum(total) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4", nativeQuery = true)
    double MachDayTTC(int year, int month, int day, int ifu);

    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4", nativeQuery = true)
    int MachDayRapports(int year, int month, int day, int ifu);

    @Query(value = "SELECT count(*) FROM factureselonspecification WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2  AND EXTRACT( DAY FROM dateheure) = ?3 AND ifu = ?4", nativeQuery = true)
    int MachDayFactures(int year, int month, int day, int ifu);

    @Query(value = "SELECT sum(total) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3", nativeQuery = true)
    double MachGetBetweenTTC(@Param("d1") Date d1, @Param("d2") Date d2, @Param("d3") int d3);

    @Query(value = "SELECT count(*) as totalTTC FROM factureselonspecification f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3", nativeQuery = true)
    double MachGetBetweenFactures(@Param("d1") Date d1, @Param("d2") Date d2, @Param("d3") int d3);

    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 AND f.ifu = :d3", nativeQuery = true)
    double MachGetBetweenRapports(@Param("d1") Date d1, @Param("d2") Date d2, @Param("d3") int d3);

    @Query(value = "SELECT COUNT(*) as nbre,SUM(f.total) as totalTTC,SUM(f.total_taxable) as totalHT FROM factureselonspecification f WHERE ifu=:ifu", nativeQuery = true)
    public Object[] getEntTotauxGlobaux(@Param("ifu") int ifu);

    @Query(value = "SELECT COUNT(*) as nbre,SUM(f.total) as totalTTC,SUM(f.total_taxable) as totalHT FROM factureselonspecification f WHERE EXTRACT( YEAR FROM dateheure) =:year AND EXTRACT( MONTH FROM dateheure) =:month AND ifu=:ifu", nativeQuery = true)
    public Object[] getEntTotauxMonth(@Param("year") int year, @Param("month") int month, @Param("ifu") int ifu);

    @Query(value = "SELECT COUNT(*) as nbre,SUM(f.total) as totalTTC,SUM(f.total_taxable) as totalHT FROM factureselonspecification f WHERE EXTRACT( YEAR FROM dateheure) =:year AND EXTRACT( MONTH FROM dateheure) =:month AND EXTRACT( DAY FROM dateheure) =:day AND ifu =:ifu", nativeQuery = true)
    public Object[] getEntTotauxDay(@Param("year") int year, @Param("month") int month, @Param("day") int day,
            @Param("ifu") int ifu);

}
