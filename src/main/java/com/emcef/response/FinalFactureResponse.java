/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.response;

/**
 *
 * @author Holy
 */
public class FinalFactureResponse {
    private String dateTime;
    private String qrCode;
    private String codeMECeFDGI;
    private String counters;
    private String nim;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getCodeMECeFDGI() {
        return codeMECeFDGI;
    }

    public void setCodeMECeFDGI(String codeMECeFDGI) {
        this.codeMECeFDGI = codeMECeFDGI;
    }

    public String getCounters() {
        return counters;
    }

    public void setCounters(String counters) {
        this.counters = counters;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
