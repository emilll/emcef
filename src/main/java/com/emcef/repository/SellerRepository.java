/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.Installations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface SellerRepository extends JpaRepository<Installations, Long> {
    public Installations findAllByIfuseller(String ifuseller);
    
    @Query(value = "SELECT count(*) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    int totalFactures(@Param("nim") String nim);
    
    @Query(value = "SELECT sum(total) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    double totalTTC(@Param("nim") String nim);
    
    @Query(value = "SELECT sum(total_taxable) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    double totalHT(@Param("nim") String nim);
    
    @Query(value = "SELECT count(*) FROM rapportcr r,machinesenregistrees m, machineinstallees i WHERE r.machinesenregistrees_id = m.id AND m.machinesinstalles_id = i.id AND i.nim = :nim", nativeQuery = true)
    int totalRapport(@Param("nim") String nim);
}
