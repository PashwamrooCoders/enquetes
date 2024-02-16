package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "enqueteInternet")
@DiscriminatorValue(value = "INTERNET")
public class EnqueteInternet extends Enquete{

    @ManyToMany(mappedBy = "enquetes")
    private Set<SitePartenaire> sitePartenaires = new HashSet<>();

    public Set<SitePartenaire> getSitePartenaires() {
        return sitePartenaires;
    }

    public void setSitePartenaires(Set<SitePartenaire> sitePartenaires) {
        this.sitePartenaires = sitePartenaires;
    }
}
