/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.repository.StatutRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class StatutService {
    @Autowired
    StatutRepository statutRepository;
    
    public int ifu(String username) {
        return statutRepository.getIfu(username);
    }
}
