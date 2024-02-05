package zyt.pashwamroo.enquetes.dto;

import java.util.Date;

public class ReponseDto {

    private Long id;
    private Date dateReponse;

    public ReponseDto(Long id, Date dateReponse) {
        this.id = id;
        this.dateReponse = dateReponse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateReponse() {
        return dateReponse;
    }

    public void setDateReponse(Date dateReponse) {
        this.dateReponse = dateReponse;
    }
}
