/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.request;

/**
 *
 * @author Holy
 */
public class ClientDto {
    private String ifu;
    private String name;
    private String contact;
    private String address;

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
