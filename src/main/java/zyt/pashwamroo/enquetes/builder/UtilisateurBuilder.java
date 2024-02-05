package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.UtilisateurDto;
import zyt.pashwamroo.enquetes.entity.Utilisateur;

import java.util.Date;

public class UtilisateurBuilder {

    private Long id;
    private String login;
    private Date dateDeNaissance;
    private String email;
    private String motDePasse;

    public UtilisateurBuilder fromUtilisateurDto(UtilisateurDto utilisateurDto) {
        id = utilisateurDto.getId();
        login = utilisateurDto.getLogin();
        dateDeNaissance = utilisateurDto.getDateDeNaissance();
        email = utilisateurDto.getEmail();
        motDePasse = utilisateurDto.getMotDePasse();
        return this;
    }

    public Long getId() {
        return id;
    }

    public UtilisateurBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public UtilisateurBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public UtilisateurBuilder withDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UtilisateurBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public UtilisateurBuilder withMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
        return this;
    }

    public Utilisateur build() {
        Utilisateur utilisateur = new Utilisateur();
        id = utilisateur.getId();
        login= utilisateur.getLogin();
        dateDeNaissance = utilisateur.getDateNaissance();
        email = utilisateur.getEmail();
        motDePasse = utilisateur.getMotDePasse();
        return utilisateur;
    }
}
