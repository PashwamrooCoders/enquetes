package zyt.pashwamroo.enquetes.dto;

import jakarta.persistence.*;


public class AvatarDto {

    private Long id;
    private String urlImage;

    @OneToOne
    private Utilisateur utilisateur;

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
