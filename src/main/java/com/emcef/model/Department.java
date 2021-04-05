package com.emcef.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "departement")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    // @Length(min=3)
    private String nom;

    // @OneToMany(mappedBy = "department") @JsonIgnore
    // private Set<Commune> communes = new HashSet<>();

    public Department() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public Set<Commune> getCommunes() {
    //     return communes;
    // }

    // public void setCommunes(Set<Commune> communes) {
    //     this.communes = communes;
    // }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     Department p = (Department) o;
    //     return id.equals(p.id) &&
    //             nom.equals(p.nom) ;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, nom);
    // }

    // @Override
    // public String toString() {
    //     return "Departement{" +
    //             "nom='" + nom + '\'' +
    //             ", id=" + id +
    //             ", createdDate=" + createdAt +
    //             ", deleted=" + deleted +
    //             '}';
    // }
}
