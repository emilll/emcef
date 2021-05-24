/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.RestController;

import com.emcef.response.StatutResponse;
import com.emcef.service.StatutService;
import com.emcef.utility.JWTUtility;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Holy
 */
@RestController
@RequestMapping("/api")
public class StatutResController {
    @Autowired
    private JWTUtility jwtUtility;
    
    @Autowired
    StatutService statutService;
    
    @Autowired
    StatutResponse statutResponse;

    @GetMapping("/inv")
    public StatutResponse ifu(HttpServletRequest httpServletRequest) throws ServletException, IOException {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;

        if (null != authorization && authorization.startsWith("Bearer ")) {
            token = authorization.substring(7);
            userName = jwtUtility.getUsernameFromToken(token);
        }
            statutResponse.setIfu(statutService.ifu(userName));

        return statutResponse;
    }
}