/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emcef.model.Contribuable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Integer> {

    // @Query(value = "SELECT c.ifu FROM contribuable c WHERE ifu=:ifu", nativeQuery
    // = true)
    public Object[] findByifu(int ifu);

    @Query(value = "SELECT * FROM contribuable c ", nativeQuery = true)
    public Object[] rehContribuableifu();

}
