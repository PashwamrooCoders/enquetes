package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.SitePartenaireDto;
import zyt.pashwamroo.enquetes.entity.SitePartenaire;

public class SitePartenaireBuilder {

    private Long id;
    private String nom;
    private String url;

    public SitePartenaireBuilder fromSitePartenaireDto(SitePartenaireDto sitePartenaireDto) {
       id = sitePartenaireDto.getId();
       nom = sitePartenaireDto.getNom();
       url = sitePartenaireDto.getUrl();
       return this;
    }

    public Long getId() {
        return id;
    }

    public SitePartenaireBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public SitePartenaireBuilder withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SitePartenaireBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public SitePartenaire build() {
        SitePartenaire sitePartenaire = new SitePartenaire();
        id = sitePartenaire.getId();
        nom = sitePartenaire.getNom();
        url = sitePartenaire.getUrl();
        return sitePartenaire;
    }
}
