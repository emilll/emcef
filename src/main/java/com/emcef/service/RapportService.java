/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import java.util.Date;
import com.emcef.repository.RapportRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class RapportService {
    RapportRepository rapportRepository;
    public Long rapportTotal(Date date){
        return rapportRepository.nbrRapport(date);
    }
}
