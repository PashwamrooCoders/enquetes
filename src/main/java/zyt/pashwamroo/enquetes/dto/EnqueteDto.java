package zyt.pashwamroo.enquetes.dto;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class EnqueteDto {

    private Calendar calendar;
    private Long id;
    private String nom;
    private Date dateLancement;
    private float prix;

    public EnqueteDto(Calendar calendar, Long id, String nom, Date dateLancement, float prix) {
        this.calendar = calendar;
        this.id = id;
        this.nom = nom;
        this.dateLancement = dateLancement;
        this.prix = prix;
    }

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
