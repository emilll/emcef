/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Holy
 */
@Controller
public class IndexController {

    @RequestMapping("/login")
    public String loginError(@RequestParam(value = "error", defaultValue = "false") boolean test) {
        if (test) {
            return "/loginerror";
        } else {
            return "/login";
        }
    }

    @GetMapping("/process-logout")
    public String logout() {
        return "redirect:/";
    }
    
    @GetMapping("/swagger-ui")
    public String apiInfo() {
        return "redirect:/swagger-ui.html";
    }

    @GetMapping("/")
    public String show() {
        return "/index";
    }
}
