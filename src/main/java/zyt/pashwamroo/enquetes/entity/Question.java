package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "idQuestion", nullable = false)
    private Long id;
    private String libelle;

    @ManyToOne
    @JoinColumn(name = "idEnquete")
    private Enquete enquete;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private List<ChoixPossible> choixPossible;

    public Enquete getEnquete() {
        return enquete;
    }

    public void setEnquete(Enquete enquete) {
        this.enquete = enquete;
    }

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

    public List<ChoixPossible> getChoixPossible() {
        return choixPossible;
    }

    public void setChoixPossible(List<ChoixPossible> choixPossible) {
        this.choixPossible = choixPossible;
    }
}
