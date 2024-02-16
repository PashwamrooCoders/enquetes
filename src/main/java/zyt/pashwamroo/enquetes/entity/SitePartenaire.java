package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "site_partenaire")
public class SitePartenaire {
    @Id
    @Column(name = "idSitePartenaire", nullable = false)
    private Long id;

    private String nom;
    private String url;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "SITEPARTENAIRE_ENQUETEINTERNET",
    joinColumns = {@JoinColumn(referencedColumnName = "idSitePartenaire")}
    ,inverseJoinColumns = {@JoinColumn(referencedColumnName = "idEnquete")})
    private Set<EnqueteInternet> enquetes = new HashSet<>();

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
