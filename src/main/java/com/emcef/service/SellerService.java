/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.service;

import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.Installations;
import com.emcef.model.Rapportcr;
import com.emcef.repository.FactureRepository;
import com.emcef.repository.RapportRepository;
import com.emcef.repository.SellerRepository;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    FactureRepository factureRepository;

    @Autowired
    RapportRepository rapportRepository;

    public List<Installations> getAll() {
        return sellerRepository.findAll();
    }

    public Installations allInfo(String ifuseller) {
        return sellerRepository.findAllByIfuseller(ifuseller);
    }

    public void savePlace(Installations installations) {
        sellerRepository.save(installations);
    }

    public JSONObject montant(String ifuseller) {
        JSONObject resultat = new JSONObject();
        double ht = 0, ttc = 0;
        int factures = 0, rapports = 0;
        for (FactureSelonSpecification str : factureRepository.findAllByIfuseller(ifuseller)) {
            ht = ht + str.getTotal_taxable();
            ttc = ttc + str.getTotal();
            factures = factures + 1;
        }
        for (Rapportcr str : rapportRepository.findAllByIfu(ifuseller)) {
            rapports = rapports + 1;
        }
        resultat.put("factures", factures);
        resultat.put("rapports", rapports);
        resultat.put("totalHT", ht);
        resultat.put("totalTTC", ttc);
        return resultat;
    }
}
