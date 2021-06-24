/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.Commune;
import com.emcef.model.Departement;
import com.emcef.model.Installations;
import com.emcef.model.Pays;
import com.emcef.model.Quartier;
import com.emcef.model.Ville;
import com.emcef.service.SellerService;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class SellerResController {
    @Autowired
    SellerService sellerService;
    
    @GetMapping("/installationall")
    public List<Installations> tout(){
        return sellerService.getAll();
    }
    
    @GetMapping("/installationinfo/{ifuseller}")
    public Installations allInfo(@PathVariable(value = "ifuseller") String ifuseller){
        return sellerService.allInfo(ifuseller);
    }
    
    @GetMapping("/installationmontant/{ifuseller}")
    public JSONObject montant(@PathVariable(value = "ifuseller") String ifuseller){
        return sellerService.montant(ifuseller);
    }
    
    @GetMapping("/findsellerbyifu/{ifuseller}")
    public Installations find(@PathVariable(value = "ifuseller") String ifuseller){
        return sellerService.allInfo(ifuseller);
    }
}
