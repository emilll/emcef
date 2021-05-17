/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.service.MachinesenregistreesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Em
 */
@RestController
@RequestMapping("/api")
public class MachineEnregistreeResController {

    @Autowired
    MachinesenregistreesService MachinesenregistreesService;

    // Nombre total de machine enrégistré
    @GetMapping("mach/nbrtotmachenr")
    public int gettotalmachineEnr() {
        return MachinesenregistreesService.gettotalmachineEnr();
    }

    // Total TTC , TOTAL TVA des machines enrégistrer
    @GetMapping("mach/nbrtotauxglobauxmach/{idmach}")
    public int gettotauxGlobauxmachine(@PathVariable(value = "idmach") int idmach) {
        return MachinesenregistreesService.gettotauxGlobauxmachine(idmach);
    }

}
