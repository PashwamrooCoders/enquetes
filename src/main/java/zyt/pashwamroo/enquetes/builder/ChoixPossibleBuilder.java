package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.ChoixPossibleDto;
import zyt.pashwamroo.enquetes.entity.ChoixPossible;

public class ChoixPossibleBuilder {
    private Long id;
    private String libelle;

    public ChoixPossibleBuilder fromChoixPossibleDto(ChoixPossibleDto choixPossibleDto) {
        id = choixPossibleDto.getId();
        libelle = choixPossibleDto.getLibelle();
        return this;
    }

    public Long getId() {
        return id;
    }

    public ChoixPossibleBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public ChoixPossibleBuilder withLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public ChoixPossible build() {
        ChoixPossible choixPossible = new ChoixPossible();
        id = choixPossible.getId();
        libelle = choixPossible.getLibelle();
        return choixPossible;
    }
}
