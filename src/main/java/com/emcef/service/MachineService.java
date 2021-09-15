/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.MachinesInstallees;
import java.util.List;
import com.emcef.repository.MachineRepository;
import org.json.simple.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Em
 */
@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;

    public List<MachinesInstallees> getAllMachines() {
        return machineRepository.getAllMachines();
    }

    public int getNbrFactNim(String nim) {
        return machineRepository.nrbFactNim(nim);
    }

    public MachinesInstallees findAllByNim(String nim) {
        return machineRepository.findAllByNim(nim);
    }
    
    public MachinesInstallees findByIfu(String ifu) {
        return machineRepository.findByIfu(ifu);
    }
    
    public List<MachinesInstallees> findAllByIfu(String ifu) {
        return machineRepository.findAllByIfu(ifu);
    }

    public List<JSONObject> allFact(String nim) {
        return machineRepository.allFact(nim);
    }

    public int totalFactures(String nim) {
        try {
            return machineRepository.totalFactures(nim);
        } catch (Exception e) {
            return 0;
        }
    }

    public int totalRapport(String nim) {
        try {
            return machineRepository.totalRapport(nim);
        } catch (Exception e) {
            return 0;
        }
    }

    public double totalTTC(String nim) {
        try {
            return machineRepository.totalTTC(nim);
        } catch (Exception e) {
            return 0;
        }
    }

    public double totalHT(String nim) {
        try {
            return machineRepository.totalHT(nim);
        } catch (Exception e) {
            return 0;
        }
    }

    public void saveMachine(MachinesInstallees machinesInstallees) {
        machineRepository.save(machinesInstallees);
    }
}
