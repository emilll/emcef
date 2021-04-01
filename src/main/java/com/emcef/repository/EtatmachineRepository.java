package com.emcef.repository;

import com.emcef.model.Etatmachine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface EtatmachineRepository extends JpaRepository<Etatmachine,Long>{

}