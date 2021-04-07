/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;
import com.emcef.repository.FactureRepository;
import com.emcef.model.Contribuable;
import com.emcef.model.FactureSelonSpecification;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class FactureService {
    @Autowired
    FactureRepository factureRepository;

    public int factureParDate(Date date) {
        return factureRepository.TotalFactureToday(date);
    }
}
