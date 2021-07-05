/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.request;

import java.util.List;

/**
 *
 * @author Holy
 */
public class FactureRequest {
    private String ifu;
    private String aib;
    private int remise;
    private String type;
    private List<ItemDto> items;
    private ClientDto client;
    private OperatorDto operator;
    private List<PaymentDto> payment;
    private String reference;

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public String getAib() {
        return aib;
    }

    public void setAib(String aib) {
        this.aib = aib;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public OperatorDto getOperator() {
        return operator;
    }

    public void setOperator(OperatorDto operator) {
        this.operator = operator;
    }

    public List<PaymentDto> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentDto> payment) {
        this.payment = payment;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
