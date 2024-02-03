package zyt.pashwamroo.enquetes.dto;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class EnqueteDto {

    private final int  PRIX_MIN = 1000;
    private final int PRIX_MAX = 25000;
    private Calendar calendar;

    private Long id;
    private String nom;
    private Date dateLancement;
    private float prix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateLancement() {
        return dateLancement;
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement = dateLancement;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

}
