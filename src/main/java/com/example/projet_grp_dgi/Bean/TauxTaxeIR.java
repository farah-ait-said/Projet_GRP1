package com.example.projet_grp_dgi.Bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Taux_IR")
public class TauxTaxeIR {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    private Date date_application_min;
    private Date date_application_max;
    private  Double pourcentage;
    private  Double salaire_max;
    private  Double salaire_min;

  //Getters And Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_application_min() {
        return date_application_min;
    }

    public void setDate_application_min(Date date_application_min) {
        this.date_application_min = date_application_min;
    }

    public Date getDate_application_max() {
        return date_application_max;
    }

    public void setDate_application_max(Date date_application_max) {
        this.date_application_max = date_application_max;
    }

    public Double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Double getSalaire_max() {
        return salaire_max;
    }

    public void setSalaire_max(Double salaire_max) {
        this.salaire_max = salaire_max;
    }

    public Double getSalaire_min() {
        return salaire_min;
    }

    public void setSalaire_min(Double salaire_min) {
        this.salaire_min = salaire_min;
    }
}
