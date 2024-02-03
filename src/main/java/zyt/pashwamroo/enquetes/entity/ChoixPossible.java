package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "choix_possible")
public class ChoixPossible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String libelle;

    @ManyToOne
    private Question question;
    @OneToMany(mappedBy = "choixPossible", fetch = FetchType.EAGER)
    private List<Reponse> reponses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
