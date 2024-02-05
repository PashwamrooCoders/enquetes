package zyt.pashwamroo.enquetes.dto;

public class SitePartenaireDto {

    private Long id;
    private String nom;
    private String url;

    public SitePartenaireDto(Long id, String nom, String url) {
        this.id = id;
        this.nom = nom;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
