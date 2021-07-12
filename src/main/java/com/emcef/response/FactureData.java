/*
 * Projet : Emcef Virtuel
 *  Auteurs: Emmanuel BOSSOU & Emile AHIATOR
 * 2021
 */
package com.emcef.response;

import com.emcef.request.ClientDto;
import com.emcef.request.ItemDto;
import com.emcef.request.OperatorDto;
import com.emcef.request.PaymentDto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Holy
 */
public class FactureData {
    private String numero;
    private String nom;
    private Date date;
    private String adresse;
    private String contact;
    private String mail;
    private String ifu;
    private int aib;
    private double montantAib;
    private String type;
    private List<ItemDto> items;
    private ClientDto client;
    private OperatorDto operator;
    private List<PaymentDto> payment;
    private String reference;
    private String dateTime;
    private String qrCode;
    private String codeMECeFDGI;
    private String counters;
    private String nim;
    private double ta; //Valeur TVA Groupe A
    private double tb; //Valeur TVA Groupe B
    private double tc; //Valeur TVA Groupe C
    private double td; //Valeur TVA Groupe D
    private double te; //Valeur TVA Groupe E
    private double tf; //Valeur TVA Groupe F
    private double taa; //Total Groupe A
    private double tab; //Total Groupe B
    private double tac; //Total Groupe C
    private double tad; //Total Groupe D
    private double tae; //Total Groupe E
    private double taf; //Total Groupe F
    private double haa; //HT Groupe A
    private double hab; //HT Groupe B
    private double hac; //HT Groupe C
    private double had; //HT Groupe D
    private double hae; //HT Groupe E
    private double haf; //HT Groupe F
    private double vaa; //TVA Groupe A
    private double vab; //TVA Groupe B
    private double vac; //TVA Groupe C
    private double vad; //TVA Groupe D
    private double vae; //TVA Groupe E
    private double vaf; //TVA Groupe F
    private double tsa; //Taxe Spécifique A
    private double tsb; //Taxe Spécifique B
    private double tsc; //Taxe Spécifique C
    private double tsd; //Taxe Spécifique D
    private double tse; //Taxe Spécifique E
    private double tsf; //Taxe Spécifique F
    private double tva; //TVA
    private double ht; //HT
    private double total; //TTC

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public int getAib() {
        return aib;
    }

    public void setAib(int aib) {
        this.aib = aib;
    }

    public double getMontantAib() {
        return montantAib;
    }

    public void setMontantAib(double montantAib) {
        this.montantAib = montantAib;
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

    public double getTa() {
        return ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double getTb() {
        return tb;
    }

    public void setTb(double tb) {
        this.tb = tb;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    public double getTd() {
        return td;
    }

    public void setTd(double td) {
        this.td = td;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTf() {
        return tf;
    }

    public void setTf(double tf) {
        this.tf = tf;
    }

    public double getTaa() {
        return taa;
    }

    public void setTaa(double taa) {
        this.taa = taa;
    }

    public double getTab() {
        return tab;
    }

    public void setTab(double tab) {
        this.tab = tab;
    }

    public double getTac() {
        return tac;
    }

    public void setTac(double tac) {
        this.tac = tac;
    }

    public double getTad() {
        return tad;
    }

    public void setTad(double tad) {
        this.tad = tad;
    }

    public double getTae() {
        return tae;
    }

    public void setTae(double tae) {
        this.tae = tae;
    }

    public double getTaf() {
        return taf;
    }

    public void setTaf(double taf) {
        this.taf = taf;
    }

    public double getHaa() {
        return haa;
    }

    public void setHaa(double haa) {
        this.haa = haa;
    }

    public double getHab() {
        return hab;
    }

    public void setHab(double hab) {
        this.hab = hab;
    }

    public double getHac() {
        return hac;
    }

    public void setHac(double hac) {
        this.hac = hac;
    }

    public double getHad() {
        return had;
    }

    public void setHad(double had) {
        this.had = had;
    }

    public double getHae() {
        return hae;
    }

    public void setHae(double hae) {
        this.hae = hae;
    }

    public double getHaf() {
        return haf;
    }

    public void setHaf(double haf) {
        this.haf = haf;
    }

    public double getVaa() {
        return vaa;
    }

    public void setVaa(double vaa) {
        this.vaa = vaa;
    }

    public double getVab() {
        return vab;
    }

    public void setVab(double vab) {
        this.vab = vab;
    }

    public double getVac() {
        return vac;
    }

    public void setVac(double vac) {
        this.vac = vac;
    }

    public double getVad() {
        return vad;
    }

    public void setVad(double vad) {
        this.vad = vad;
    }

    public double getVae() {
        return vae;
    }

    public void setVae(double vae) {
        this.vae = vae;
    }

    public double getVaf() {
        return vaf;
    }

    public void setVaf(double vaf) {
        this.vaf = vaf;
    }

    public double getTsa() {
        return tsa;
    }

    public void setTsa(double tsa) {
        this.tsa = tsa;
    }

    public double getTsb() {
        return tsb;
    }

    public void setTsb(double tsb) {
        this.tsb = tsb;
    }

    public double getTsc() {
        return tsc;
    }

    public void setTsc(double tsc) {
        this.tsc = tsc;
    }

    public double getTsd() {
        return tsd;
    }

    public void setTsd(double tsd) {
        this.tsd = tsd;
    }

    public double getTse() {
        return tse;
    }

    public void setTse(double tse) {
        this.tse = tse;
    }

    public double getTsf() {
        return tsf;
    }

    public void setTsf(double tsf) {
        this.tsf = tsf;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getHt() {
        return ht;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
