/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import com.emcef.model.Rapportcr;
import java.util.Date;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface RapportRepository extends JpaRepository<Rapportcr, Integer> {

    //Début API Statut
    @Query(value = "SELECT ifu FROM  utilisateurs u WHERE u.username =:user", nativeQuery = true)
    String getIfu(@Param("user") String username);

    @Query(value = "SELECT derniere_version FROM  machinesenregistrees u, machineinstallees f WHERE u.machinesinstalles_id = f.id AND f.ifu =:ifu", nativeQuery = true)
    String getVersion(@Param("ifu") String ifu);

    @Query(value = "SELECT nim FROM  machineinstallees u WHERE u.ifu =:ifu", nativeQuery = true)
    String getNim(@Param("ifu") String ifu);

    @Query(value = "SELECT count(*) FROM  factureselonspecification u WHERE u.en_attente = false", nativeQuery = true)
    int getCountPending();

    @Query(value = "SELECT dateheure date, uid FROM  factureselonspecification u WHERE u.status = false", nativeQuery = true)
    List<JSONObject> getAllPending();
    //Fin API Statut

    //Début API Information sur les e-mcf
    @Query(value = "SELECT nim, u.status, nom_commercial shopname, i.adresse address1, i.description_location address2, i.ville address3, i.telephone contact1, i.email contact2, i.contact_personnel contact3 FROM  machineinstallees u, machinesenregistrees m, installations i WHERE m.machinesinstalles_id=u.id AND u.id_installation_id = i.id", nativeQuery = true)
    List<JSONObject> getData();
    //Fin API Information sur les e-mcf

    //Début API Groupe de taxation
    @Query(value = "SELECT a, b, c, d, e, f, aibA, aibB FROM  taxesgroupes", nativeQuery = true)
    JSONObject getTax();
    //FIN API Groupe de taxation

    //Début API Types de paiement
    @Query(value = "SELECT type, description FROM  typespaiment", nativeQuery = true)
    List<JSONObject> getPay();
    //Fin API Types de paiement

    //Début API Types de factures
    @Query(value = "SELECT type, description FROM  typesfactures", nativeQuery = true)
    List<JSONObject> getFact();
    //Fin API Types de factures

    @Query(value = "SELECT count(*) FROM  rapportcr", nativeQuery = true)
    int totalRapport();

    @Query(value = "SELECT count(*) FROM  rapportcr WHERE EXTRACT( YEAR FROM dateheure) =:year AND EXTRACT( MONTH FROM dateheure) =:month AND EXTRACT( DAY FROM dateheure) =:day", nativeQuery = true)
    int nbrRapport(@Param("year") int year, @Param("month") int month, @Param("day") int day);

    @Query(value = "SELECT count(*) FROM rapportcr WHERE EXTRACT( YEAR FROM dateheure) = ?1 AND EXTRACT( MONTH FROM dateheure) = ?2", nativeQuery = true)
    int MonthRapports(int year, int month);

    @Query(value = "SELECT count(*) as totalTTC FROM rapportcr f WHERE f.dateheure BETWEEN :d1 AND :d2 ", nativeQuery = true)
    double getBetweenRapports(@Param("d1") Date d1, @Param("d2") Date d2);

    //Interface Entreprise
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE dateheure = ?1 AND ifu = ?2", nativeQuery = true)
    int nbrEntRapport(Date date, int ifu);

    //Interface Machines
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE dateheure = ?1", nativeQuery = true)
    int nbrMachRapport(Date date);

    public Iterable<Rapportcr> findAllByIfu(String ifuseller);
}
