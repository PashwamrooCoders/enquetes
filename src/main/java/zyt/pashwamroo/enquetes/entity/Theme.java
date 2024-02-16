package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTheme", nullable = false)
    private Long id;
    private String nom;

    @OneToMany(mappedBy="theme", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Enquete> enquetes;

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
}
