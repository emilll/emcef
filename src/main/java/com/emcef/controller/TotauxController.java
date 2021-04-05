/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.Response.TotalTTC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
public class TotauxController {
    @GetMapping("/json")
    public TotalTTC json(){
        TotalTTC reponse = new TotalTTC(30, 12, 15, 85, 95, 65, 458, 25, 465, 48, 14, 45);
        return reponse;
    }
}
