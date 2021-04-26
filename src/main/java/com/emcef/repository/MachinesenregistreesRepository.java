package com.emcef.repository;

import com.emcef.model.Machinesenregistrees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface MachinesenregistreesRepository extends JpaRepository<Machinesenregistrees, Long> {

}