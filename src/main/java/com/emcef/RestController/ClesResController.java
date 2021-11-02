/*
 * Copyright 2021 Emmanuel, Flutter, Spring-Boot.
 *
 * BOSSOU Emmanuel
 * Projet Emcef
 * JSCOM
 *
 *      https://www.jscom.bj
 *
 * Ce code source est propriétaire.
 * Ne pas copier ou reproduire d'une quelconque manière ce code source.
 */
package com.emcef.RestController;

import com.emcef.service.ClesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Emmanuel, Flutter, Spring-Boot
 */
@RestController
@RequestMapping("/api")
public class ClesResController {

    @Autowired
    ClesService clesService;

    @PostMapping("/key")
    public String cle(@RequestBody String enim) {
        try {
            return clesService.findByEnim(enim).getCleInterne();
        } catch (Exception e) {
            return new String();
        }
    }
}
