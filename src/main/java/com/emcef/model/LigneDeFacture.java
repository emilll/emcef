/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Holy
 */
@Entity
@Table(name = "lignedefacture")
public class LigneDeFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @OneToOne
    FactureSelonSpecification facture;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "quantity")
    private double quantity;
    
    @Column(name = "price")
    private double price;
    
    @Column(name = "pricetaxable")
    private double pricetaxable;
    
    @Column(name = "amount")
    private double amount;
    
    @Column(name = "amounttaxable")
    private double amounttaxable;
    
    @Column(name = "taxratelabel")
    private String taxratelabel;
    
    @Column(name = "taxrate")
    private double taxrate;
    
    @Column(name = "tax")
    private int tax;
    
    @Column(name = "taxamount")
    private double taxamount;
    
    @Column(name = "ordinalnumber")
    private int ordinalnumber;
    
    @Column(name = "modifiername")
    private String modifiername;
    
    @Column(name = "modifiervalue")
    private String modifiervalue;
    
    @Column(name = "originalprice")
    private double originalprice;
    
    @Column(name = "islabel")
    private boolean islabel;
    
    @Column(name = "ists")
    private boolean ists;
    
    @Column(name = "tsprice")
    private double tsprice;
    
    @Column(name = "tspricetaxable")
    private double tspricetaxable;
    
    @Column(name = "tstax")
    private double tstax;
    
    @Column(name = "tstaxamount")
    private double tstaxamount;
    
    @Column(name = "tsamount")
    private double tsamount;
    
    @Column(name = "tsamounttaxable")
    private double tsamounttaxable;

    public FactureSelonSpecification getFacture() {
        return facture;
    }

    public void setFacture(FactureSelonSpecification facture) {
        this.facture = facture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPricetaxable() {
        return pricetaxable;
    }

    public void setPricetaxable(double pricetaxable) {
        this.pricetaxable = pricetaxable;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmounttaxable() {
        return amounttaxable;
    }

    public void setAmounttaxable(double amounttaxable) {
        this.amounttaxable = amounttaxable;
    }

    public String getTaxratelabel() {
        return taxratelabel;
    }

    public void setTaxratelabel(String taxratelabel) {
        this.taxratelabel = taxratelabel;
    }

    public double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(double taxrate) {
        this.taxrate = taxrate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(double taxamount) {
        this.taxamount = taxamount;
    }

    public int getOrdinalnumber() {
        return ordinalnumber;
    }

    public void setOrdinalnumber(int ordinalnumber) {
        this.ordinalnumber = ordinalnumber;
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername;
    }

    public String getModifiervalue() {
        return modifiervalue;
    }

    public void setModifiervalue(String modifiervalue) {
        this.modifiervalue = modifiervalue;
    }

    public double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(double originalprice) {
        this.originalprice = originalprice;
    }

    public boolean isIslabel() {
        return islabel;
    }

    public void setIslabel(boolean islabel) {
        this.islabel = islabel;
    }

    public boolean isIsts() {
        return ists;
    }

    public void setIsts(boolean ists) {
        this.ists = ists;
    }

    public double getTsprice() {
        return tsprice;
    }

    public void setTsprice(double tsprice) {
        this.tsprice = tsprice;
    }

    public double getTspricetaxable() {
        return tspricetaxable;
    }

    public void setTspricetaxable(double tspricetaxable) {
        this.tspricetaxable = tspricetaxable;
    }

    public double getTstax() {
        return tstax;
    }

    public void setTstax(double tstax) {
        this.tstax = tstax;
    }

    public double getTstaxamount() {
        return tstaxamount;
    }

    public void setTstaxamount(double tstaxamount) {
        this.tstaxamount = tstaxamount;
    }

    public double getTsamount() {
        return tsamount;
    }

    public void setTsamount(double tsamount) {
        this.tsamount = tsamount;
    }

    public double getTsamounttaxable() {
        return tsamounttaxable;
    }

    public void setTsamounttaxable(double tsamounttaxable) {
        this.tsamounttaxable = tsamounttaxable;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
}
