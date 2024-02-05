package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.ReponseDto;
import zyt.pashwamroo.enquetes.entity.Reponse;

import java.util.Date;

public class ReponseBuilder {

    private Long id;
    private Date dateReponse;

    public ReponseBuilder fromReponseDto(ReponseDto reponseDto) {
        id = reponseDto.getId();
        dateReponse = reponseDto.getDateReponse();
        return this;
    }

    public Long getId() {
        return id;
    }

    public ReponseBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public Date getDateReponse() {
        return dateReponse;
    }

    public ReponseBuilder withDateReponse(Date dateReponse) {
        this.dateReponse = dateReponse;
        return this;
    }

    public Reponse build() {
        Reponse reponse = new Reponse();
        id = reponse.getId();
        dateReponse = reponse.getDateReponse();
        return reponse;
    }
}
