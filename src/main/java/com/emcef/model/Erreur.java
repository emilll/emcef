/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Holy
 */
@Entity
@Table(name = "error")
public class Erreur {
    @Id
    private Long id;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErrorCode() {
        return code;
    }

    public void setErrorCode(String errorCode) {
        this.code = errorCode;
    }

    public String getErrorDesc() {
        return description;
    }

    public void setErrorDesc(String errorDesc) {
        this.description = errorDesc;
    }
}
