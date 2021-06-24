/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.Commune;
import com.emcef.model.Departement;
import com.emcef.model.Pays;
import com.emcef.model.Quartier;
import com.emcef.model.Ville;
import com.emcef.repository.CommuneRepository;
import com.emcef.repository.DepartementRepository;
import com.emcef.repository.PaysRepository;
import com.emcef.repository.QuartierRepository;
import com.emcef.repository.VilleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class EmplacementService {

    @Autowired
    DepartementRepository departementRepository;

    @Autowired
    PaysRepository paysRepository;

    @Autowired
    CommuneRepository communeRepository;

    @Autowired
    VilleRepository villeRepository;

    @Autowired
    QuartierRepository quartierRepository;

    public List<Pays> allPays() {
        return paysRepository.findAll();
    }

    public String savePays(Pays pays) {
        boolean test = true;
        for (Pays str : paysRepository.findAll()) {
            if (str.getNom().equals(pays.getNom())) {
                test = false;
            }
        }
        if (test) {
            paysRepository.save(pays);
            if (paysRepository.findAllById(pays.getId()).getNom().isEmpty()) {
                return "false";
            } else {
                return "true";
            }
        } else {
            return "exist";
        }
    }

    public String saveDepartement(Departement departement) {
        boolean test = true;
        for (Departement str : departementRepository.findAll()) {
            if (str.getNom().equals(departement.getNom())) {
                test = false;
            }
        }
        if (test) {
            departementRepository.save(departement);
            if (departementRepository.findAllById(departement.getId()).getNom().isEmpty()) {
                return "false";
            } else {
                return "true";
            }
        } else {
            return "exist";
        }
    }

    public String saveCommune(Commune commune) {
        boolean test = true;
        for (Commune str : communeRepository.findAll()) {
            if (str.getNom().equals(commune.getNom())) {
                test = false;
            }
        }
        if (test) {
            communeRepository.save(commune);
            if (communeRepository.findAllById(commune.getId()).getNom().isEmpty()) {
                return "false";
            } else {
                return "true";
            }
        } else {
            return "exist";
        }
    }

    public String saveVille(Ville ville) {
        boolean test = true;
        for (Ville str : villeRepository.findAll()) {
            if (str.getNom().equals(ville.getNom())) {
                test = false;
            }
        }
        if (test) {
            villeRepository.save(ville);
            if (villeRepository.findAllById(ville.getId()).getNom().isEmpty()) {
                return "false";
            } else {
                return "true";
            }
        } else {
            return "exist";
        }
    }

    public String saveQuartier(Quartier quartier) {
        boolean test = true;
        for (Quartier str : quartierRepository.findAll()) {
            if (str.getNom().equals(quartier.getNom())) {
                test = false;
            }
        }
        if (test) {
            quartierRepository.save(quartier);
            if (quartierRepository.findAllById(quartier.getId()).getNom().isEmpty()) {
                return "false";
            } else {
                return "true";
            }
        } else {
            return "exist";
        }
    }

    public List<Departement> allDepartements() {
        return departementRepository.findAll();
    }

    public List<Commune> allCommunes() {
        return communeRepository.findAll();
    }

    public List<Ville> allVilles() {
        return villeRepository.findAll();
    }

    public Pays findPaysById(int id) {
        return paysRepository.findAllById(id);
    }

    public Departement findDepartementById(int id) {
        return departementRepository.findAllById(id);
    }

    public Commune findCommuneById(int id) {
        return communeRepository.findAllById(id);
    }

    public Ville findVilleById(int id) {
        return villeRepository.findAllById(id);
    }
}
