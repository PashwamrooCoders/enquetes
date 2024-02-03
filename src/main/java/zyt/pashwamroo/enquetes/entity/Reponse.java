package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reponse")
public class Reponse {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateReponse;

    @ManyToOne
    private ChoixPossible choixPossible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
