package com.emcef.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "district")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    private String nom;

    @ManyToOne 
    private Commune commune;

    // @OneToMany(mappedBy = "district") @JsonIgnore
    // private Set<Hospital> hospitals = new HashSet<>();

    public District() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

   

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     District district = (District) o;
    //     return id.equals(district.id) && nom.equals(district.nom) &&
    //             Objects.equals(commune, district.commune);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, nom, commune);
    // }

    @Override
    public String toString() {
        return "District [commune=" + commune + ", id=" + id + ", nom=" + nom + "]";
    }

    
}
