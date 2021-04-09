package com.emcef.repository;


import com.emcef.model.FactureSelonSpecification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface FactureSelonSpecificationRepository extends JpaRepository<FactureSelonSpecification,Long>{

    // @Query("select p from Facture p where p.fournisseur.code=:x and p.dateFacture=:d and p.dossier.numero=:num")
	// public Page<FactureSelonSpecification> findAllFacturesOfFournisseur(@Param("num")Long numeroDossier,@Param("x")String code,@Param("d")Date date,  Pageable pageable);

    //  @Query(value = "SELECT * FROM factureselonspecifiaction")
     
    @Query(value = "SELECT count(*) FROM factureselonspecifiaction n",nativeQuery = true)
    long nbrFact();


    @Query(value = "SELECT sum(total) as totalTTC , sum(total_taxable) as totalTVA FROM factureselonspecifiaction",nativeQuery = true)
    Double getTotalTTC();

    @Query(value = "SELECT(sum(total)  - sum(total_taxable)) as totalTVA FROM factureselonspecifiaction",nativeQuery = true)
    Double getTotalTVA();


    // @Query(value = "SELECT f.total as totalTTC, f.total_taxable as totalHT,(f.total - f.total_taxable) as totalTVA FROM factureselonspecifiaction f WHERE f.ifu =:ifu AND f.dateheure BETWEEN :d1 AND :d2",nativeQuery = true)
    // Double getFactTotauxContribuable(@Param("ifu")Long ifu,@Param("d1")Date d1, @Param("d2")Date d2);
    
    @Query(value = "SELECT sum(total) as totalTTC, sum(total_taxable) as totalHT FROM factureselonspecifiaction f WHERE f.ifu =:ifu",nativeQuery = true)
    String getFactTotauxContribuable(@Param("ifu")String ifu);

    @Query(value = "SELECT sum(total) as totalTTC, sum(total_taxable) as totalHT FROM factureselonspecifiaction f WHERE f.ifu =:ifu AND f.dateheure=:d1",nativeQuery = true)
    Double getFactTotauxContribuable2(@Param("ifu")String ifu,@Param("d1")String d1);

    // @Query("select count(f) from FactureSelonSpecification f where f.dossier.numero=:num")
	// public Integer count(@Param("num")Long numeroDossier);
}