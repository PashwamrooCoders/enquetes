package zyt.pashwamroo.enquetes.dto;

import jakarta.persistence.*;


public class AvatarDto {

    public AvatarDto(Long id, String urlImage) {
        this.id = id;
        this.urlImage = urlImage;
    }

    private Long id;
    private String urlImage;

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
