/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emcef.model.Contribuable.Contribuables;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuables, Long> {
    
}
