package zyt.pashwamroo.enquetes.dto;

import jakarta.persistence.*;

import java.util.List;

public class ChoixPossibleDto {
    private Long id;
    private String libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
