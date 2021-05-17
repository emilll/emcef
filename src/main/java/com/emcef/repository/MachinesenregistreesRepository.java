package com.emcef.repository;

import com.emcef.model.Machinesenregistrees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface MachinesenregistreesRepository extends JpaRepository<Machinesenregistrees, Long> {

    // Nombre total de machine enrégistré
    @Query(value = "SELECT COUNT(*) FROM machinesenregistrees m", nativeQuery = true)
    public int gettotalmachineEnr();

    // Total TTC , TOTAL TVA des machines enrégistrer
    @Query(value = "SELECT SUM(montant_a+montant_b+montant_c+montant_d+montant_e+montant_f) as totalTTC FROM rapportzr r WHERE r.machinesenregistrees_id=:idmach", nativeQuery = true)
    public int gettotauxGlobauxmachine(@Param("idmach") int idmach);

}