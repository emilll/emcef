package com.emcef.repository;

import com.emcef.model.Certificatsenregistres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */

@Repository
public interface CertificatsenregistresRepository extends JpaRepository<Certificatsenregistres,Long>{

}