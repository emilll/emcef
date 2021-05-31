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
public class ItemDto {
    private String code;
    private String name;
    private double price;
    private double quantity;
    private String taxGroup;
    private int taxSpecific;
    private int originalPrice;
    private String priceModification;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getTaxGroup() {
        return taxGroup;
    }

    public void setTaxGroup(String taxGroup) {
        this.taxGroup = taxGroup;
    }

    public int getTaxSpecific() {
        return taxSpecific;
    }

    public void setTaxSpecific(int taxSpecific) {
        this.taxSpecific = taxSpecific;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPriceModification() {
        return priceModification;
    }

    public void setPriceModification(String priceModification) {
        this.priceModification = priceModification;
    }
}
