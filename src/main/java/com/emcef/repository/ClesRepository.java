/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import com.emcef.model.Cles;
import com.emcef.model.Machinesenregistrees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface ClesRepository extends JpaRepository<Cles, Integer> {

    public Cles findByMachinesenregistrees(Machinesenregistrees machinesenregistrees);
    
    public Cles findByCleinterne(String key);
}
