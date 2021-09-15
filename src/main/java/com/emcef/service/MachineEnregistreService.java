/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.MachinesInstallees;
import com.emcef.model.Machinesenregistrees;
import com.emcef.repository.MachineEnregistreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class MachineEnregistreService {

    @Autowired
    private MachineEnregistreRepository machineEnregistreRepository;

    public void saveMachine(Machinesenregistrees machinesenregistrees) {
        machineEnregistreRepository.save(machinesenregistrees);
    }

    public List<Machinesenregistrees> getAllMachines() {
        return machineEnregistreRepository.findAll();
    }

    public Machinesenregistrees findByMachinesinstalles(MachinesInstallees machine) {
        return machineEnregistreRepository.findByMachinesinstalles(machine);
    }
}
