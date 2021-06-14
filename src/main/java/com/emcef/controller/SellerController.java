/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Holy
 */
@Controller
public class SellerController {
    @GetMapping("/saveseller")
    public String saveseller() {
        return "/seller/save";
    }
}
