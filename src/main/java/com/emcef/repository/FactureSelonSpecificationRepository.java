package com.emcef.repository;

import com.emcef.model.FactureSelonSpecification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    

    // @Query("select count(f) from FactureSelonSpecification f where f.dossier.numero=:num")
	// public Integer count(@Param("num")Long numeroDossier);
}