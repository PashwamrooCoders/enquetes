package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.ThemeDto;
import zyt.pashwamroo.enquetes.entity.Theme;

public class ThemeBuilder {
    private Long id;
    private String nom;

    public ThemeBuilder fromThemeDto(ThemeDto themeDto) {
        id = themeDto.getId();
        nom = themeDto.getNom();
        return this;
    }

    public Long getId() {
        return id;
    }

    public ThemeBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ThemeBuilder withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Theme build() {
        Theme theme = new Theme();
        id = theme.getId();
        nom = theme.getNom();
        return theme;
    }
}
