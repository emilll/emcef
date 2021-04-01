package com.emcef.repository;

import com.emcef.model.Typesmachines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface TypesmachinesRepository extends JpaRepository<Typesmachines,Long>{

}