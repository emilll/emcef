/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;


import com.emcef.model.Installations;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */

@Repository
public interface InstallationsRepository extends JpaRepository<Installations, Long>{
    @Query(value = "SELECT * FROM installations c", nativeQuery = true)
    List<Installations> all();

    @Query(value = "SELECT * FROM installations c WHERE c.ifu_seller = :ifu_seller", nativeQuery = true)
    Installations findAllByIfu(@Param("ifu_seller") String ifu_seller);
}
