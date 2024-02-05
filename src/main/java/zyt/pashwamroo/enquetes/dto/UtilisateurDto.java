package zyt.pashwamroo.enquetes.dto;

import java.util.Date;

public class UtilisateurDto {

    private Long id;
    private String login;
    private Date dateDeNaissance;
    private String email;
    private String motDePasse;

    public UtilisateurDto(Long id, String login, Date dateDeNaissance, String email, String motDePasse) {
        this.id = id;
        this.login = login;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
