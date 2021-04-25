/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.service.ContribuableService;

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
public class ContribuableResController {

    @Autowired
    ContribuableService contribuableService;

    @GetMapping("/ent/findcontribuable/{ifu}")
    public Object[] findContribuable(@PathVariable(value = "ifu") int ifu) {

        return contribuableService.findContribuableByIfu(ifu);

    }
}
