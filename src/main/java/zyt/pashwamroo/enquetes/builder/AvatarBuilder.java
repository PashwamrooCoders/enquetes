package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.AvatarDto;
import zyt.pashwamroo.enquetes.entity.Avatar;

public class AvatarBuilder {

    private Long id;
    private String urlImage;

    public AvatarBuilder fromAvatarDto(AvatarDto avatarDto) {
        id = avatarDto.getId();
        urlImage = avatarDto.getUrlImage();
        return this;
    }

    public Long getId() {
        return id;
    }

    public AvatarBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public AvatarBuilder withUrlImage(String urlImage) {
        this.urlImage = urlImage;
        return this;
    }

    public Avatar build() {
        Avatar avatar = new Avatar();
        id = avatar.getId();
        urlImage = avatar.getUrlImage();
        return avatar;
    }
}
