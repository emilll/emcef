/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Contribuable;
import com.emcef.repository.ContribuableRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class ContribuableService {
    @Autowired
    ContribuableRepository contribuableRepository;

    public List<Contribuable> getAllContribuable() {
        return contribuableRepository.findAll();
    }

    public void saveContribuable(Contribuable contribuable) {
        this.contribuableRepository.save(contribuable);
    }

    public void deleteContribuableById(int id) {
        this.contribuableRepository.deleteById(id);
    }

    public Contribuable findContribuableByIfu(int ifu) {
        return contribuableRepository.findByIfu(ifu);
    }

    public Contribuable findContribuableByRccm(String rccm) {
        return contribuableRepository.findByRccm(rccm);
    }

    public Contribuable findContribuableByNom(String nom) {
        return contribuableRepository.findByNom(nom);
    }

    // **********************service des API DEBUT*********************
    public int getIdByIfu(int ifu) {
        return contribuableRepository.getIdByIfu(ifu);
    }

    public int getIdByRccm(String rccm) {
        return contribuableRepository.getIdByRccm(rccm);
    }

    public int getIdByNom(String nom) {
        return contribuableRepository.getIdByNom(nom);
    }

    // **********************service des API FIN*********************

}