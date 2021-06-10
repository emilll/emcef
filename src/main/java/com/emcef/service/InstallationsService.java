/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.service;

import com.emcef.model.Installations;
import com.emcef.repository.InstallationsRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Holy
 */
@Service
public class InstallationsService {

    @Autowired
    InstallationsRepository installationsrepository;

    public List<Installations> getAll() {
        return installationsrepository.all();
    }

    public Installations allInfo(String ifu_seller) {
        return installationsrepository.findAllByIfu(ifu_seller);
    }
}
