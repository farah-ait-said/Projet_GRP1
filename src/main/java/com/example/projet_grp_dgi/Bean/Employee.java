package com.example.projet_grp_dgi.Bean;

import javax.persistence.*;
@Table(name="Employee")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(nullable = false,name="cin_employee")
    private String cin;

    @JoinColumn(nullable = false,name="nom_employee")
    private String nom;

    @JoinColumn(nullable = false,name="prénom_employee")
    private String prenom;


    //Getters and Setters:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
