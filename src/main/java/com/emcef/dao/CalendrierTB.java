package com.emcef.dao;



public class CalendrierTB {
    private String millis;
    private String nbreFacture;

    
    public String getmillis() {
        return millis;
    }
    public CalendrierTB() {
    }
    public CalendrierTB(String millis, String nbreFacture) {
        this.millis = millis;
        this.nbreFacture = nbreFacture;
    }
    public void setmillis(String date) {
        this.millis = date;
    }
    public String getNbreFacture() {
        return nbreFacture;
    }
    public void setNbreFacture(String nbreFacture) {
        this.nbreFacture = nbreFacture;
    }
}
