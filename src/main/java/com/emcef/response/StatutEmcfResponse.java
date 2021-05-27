/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.response;

import java.util.Date;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Holy
 */
@Component
public class StatutEmcfResponse {
    private boolean status;
    private String version;
    private String ifu;
    private String nim;
    private Date tokenValid;
    private Date serverDateTime;
    private List<JSONObject> emcfList;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Date getTokenValid() {
        return tokenValid;
    }

    public void setTokenValid(Date tokenValid) {
        this.tokenValid = tokenValid;
    }

    public Date getServerDateTime() {
        return serverDateTime;
    }

    public void setServerDateTime(Date serverDateTime) {
        this.serverDateTime = serverDateTime;
    }

    public List<JSONObject> getEmcfList() {
        return emcfList;
    }

    public void setEmcfList(List<JSONObject> emcfList) {
        this.emcfList = emcfList;
    }

    
}
