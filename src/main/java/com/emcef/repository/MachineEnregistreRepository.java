/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.repository;

import com.emcef.model.MachinesInstallees;
import com.emcef.model.Machinesenregistrees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface MachineEnregistreRepository extends JpaRepository<Machinesenregistrees, Integer> {
    public Machinesenregistrees findByMachinesinstalles(MachinesInstallees machine);
}
