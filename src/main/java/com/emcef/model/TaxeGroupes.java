/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Holy
 */
@Entity
@Table(name = "taxesgroupes")
public class TaxeGroupes {

    @Id
    private Long id;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int aibA;
    private int aibB;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getAibA() {
        return aibA;
    }

    public void setAibA(int aibA) {
        this.aibA = aibA;
    }

    public int getAibB() {
        return aibB;
    }

    public void setAibB(int aibB) {
        this.aibB = aibB;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
