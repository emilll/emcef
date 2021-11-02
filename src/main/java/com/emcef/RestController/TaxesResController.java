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

import com.emcef.model.TaxeGroupes;
import com.emcef.service.TaxesService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Emmanuel, Flutter, Spring-Boot
 */
@RestController
@RequestMapping("/api")
public class TaxesResController {

    @Autowired
    private TaxesService taxesService;

    @GetMapping("/taxes")
    public TaxeGroupes taxes(HttpServletResponse response) {
        return taxesService.findAllById(1L);
    }
}
