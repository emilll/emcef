package com.emcef.model.Contribuable;

import com.emcef.model.Centres.Centres_fiscaux;
import com.emcef.model.Centres.Secteurs;
import com.emcef.model.Certificats_enregistres;
import com.emcef.model.Installations;
import java.util.Date;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Entity
public class Contribuables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    private Date _date_heure;
    private String _ifu;
    private String _rccm;
    private String _nom;
    private String _adresse;
    private String _adresse2;
    private String _adresse3;
    private String _adresse4;
    private String _ville;
    private String _zip;
    private String _description_location;
    private String _telephone;
    private String _contact_personnel;
    private String _email;
    private Date _date_enregistrement;
    private Integer _id_activite;
    private String _commentaire;
    public Centres_fiscaux _id_centre_fiscal;
    public Secteurs _id_secteur;
    public Vector<Certificats_enregistres> _certificats_enregistres = new Vector<Certificats_enregistres>();
    public Vector<Installations> _installations = new Vector<Installations>();
}