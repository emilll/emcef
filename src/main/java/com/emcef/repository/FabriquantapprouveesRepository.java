package com.emcef.repository;

import com.emcef.model.Fabriquantapprouvees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface FabriquantapprouveesRepository extends JpaRepository<Fabriquantapprouvees,Long>{

}