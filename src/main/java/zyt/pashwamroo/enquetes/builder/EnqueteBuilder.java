package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.EnqueteDto;
import zyt.pashwamroo.enquetes.entity.Enquete;

import java.util.Calendar;
import java.util.Date;

public class EnqueteBuilder {

    private Long id;
    private String nom;
    private Date dateLancement;
    private float prix;
    private Calendar calendar;

    public EnqueteBuilder fromEnqueteDto(EnqueteDto enqueteDto) {
        id = enqueteDto.getId();
        nom = enqueteDto.getNom();
        dateLancement = enqueteDto.getDateLancement();
        prix = enqueteDto.getPrix();
        calendar = enqueteDto.getCalendar();
        return this;
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

    public Enquete build() {
        return null;
    }
}
