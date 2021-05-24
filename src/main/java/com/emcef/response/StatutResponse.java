/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class StatutResponse {

    private boolean status;
    private String version;
    private int ifu;
    private String nim;
    private Date tokenValid;
    private Date serverDateTime;
    private int pendingRequestsCount;
    private List<JSONObject> pendingRequestsList;

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

    public int getIfu() {
        return ifu;
    }

    public void setIfu(int ifu) {
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

    public int getPendingRequestsCount() {
        return pendingRequestsCount;
    }

    public void setPendingRequestsCount(int pendingRequestsCount) {
        this.pendingRequestsCount = pendingRequestsCount;
    }

    public List<JSONObject> getPendingRequestsList() {
        return pendingRequestsList;
    }

    public void setPendingRequestsList(List<JSONObject> pendingRequestsList) {
        this.pendingRequestsList = pendingRequestsList;
    }
}
