/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Cles;
import com.emcef.model.MachinesInstallees;
import com.emcef.model.Machinesenregistrees;
import com.emcef.repository.ClesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class ClesService {

    @Autowired
    ClesRepository clesRepository;
    
    @Autowired
    MachineService machineService;
    
    @Autowired
    MachineEnregistreService machineEnregistreService;

    public Cles findByMachine (Machinesenregistrees machinesenregistrees) {
        return clesRepository.findByMachinesenregistrees(machinesenregistrees);
    }
    
    public Cles findByEnim (String enim) {
        MachinesInstallees machine = machineService.findAllByNim(enim);
        Machinesenregistrees machineEnregistrees = machineEnregistreService.findByMachinesinstalles(machine);
        return findByMachine(machineEnregistrees);
    }
    
    public MachinesInstallees findMachineByKey(String key){
        return clesRepository.findByCleinterne(key).getMachinesenregistrees().getMachinesinstalles();
    }
}
