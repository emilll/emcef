package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cles")
public class Cles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    Machinesenregistrees machinesenregistrees;

    @Column(name = "clechiffrement")
    private String clechiffrement;

    @Column(name = "clesignature")
    private String clesignature;

    @Column(name = "cleinterne")
    private String cleinterne;

    @Column(name = "ec384pub")
    private String ec384pub;

    @Column(name = "ec384priv")
    private String ec384priv;

    @Column(name = "rsa2048priv")
    private String rsa2048priv;

    @Column(name = "rsa4096pub")
    private String rsa4096pub;

    @Column(name = "rsa4096priv")
    private String rsa4096priv;

    public Cles() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Machinesenregistrees getMachinesenregistrees() {
        return machinesenregistrees;
    }

    public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
        this.machinesenregistrees = machinesenregistrees;
    }

    public String getCleChiffrement() {
        return clechiffrement;
    }

    public void setCleChiffrement(String clechiffrement) {
        this.clechiffrement = clechiffrement;
    }

    public String getCleSignature() {
        return clesignature;
    }

    public void setCleSignature(String clesignature) {
        this.clesignature = clesignature;
    }

    public String getCleInterne() {
        return cleinterne;
    }

    public void setCleInterne(String cleinterne) {
        this.cleinterne = cleinterne;
    }

    public String getEc384pub() {
        return ec384pub;
    }

    public void setEc384pub(String ec384pub) {
        this.ec384pub = ec384pub;
    }

    public String getEc384priv() {
        return ec384priv;
    }

    public void setEc384priv(String ec384priv) {
        this.ec384priv = ec384priv;
    }

    public String getRsa2048priv() {
        return rsa2048priv;
    }

    public void setRsa2048priv(String rsa2048priv) {
        this.rsa2048priv = rsa2048priv;
    }

    public String getRsa4096pub() {
        return rsa4096pub;
    }

    public void setRsa4096pub(String rsa4096pub) {
        this.rsa4096pub = rsa4096pub;
    }

    public String getRsa4096priv() {
        return rsa4096priv;
    }

    public void setRsa4096priv(String rsa4096priv) {
        this.rsa4096priv = rsa4096priv;
    }
}
