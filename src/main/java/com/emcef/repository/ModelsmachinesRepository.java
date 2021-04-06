package com.emcef.repository;

import com.emcef.model.Modelsmachines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface ModelsmachinesRepository extends JpaRepository<Modelsmachines, Integer>{

}