/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.repository;

import java.util.Date;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Holy
 */
@Repository
public interface RapportRepository {
    @Query(value = "SELECT count(*) FROM  rapportcr WHERE date_heure = ?1",nativeQuery = true)
    int nbrRapport(Date date);
}
