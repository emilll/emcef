/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.RestController;

import com.emcef.model.Installations;
import com.emcef.service.InstallationsService;
import java.util.List;
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
public class InstallationsRestController {
    @Autowired
    InstallationsService installationsService;
    
    @GetMapping("/installationall")
    public List<Installations> all(){
        return installationsService.getAll();
    }
    
    @GetMapping("/installationinfo/{ifu_seller}")
    public Installations allInfo(@PathVariable(value = "ifu_seller") String ifu_seller){
        return installationsService.allInfo(ifu_seller);
    }
}
