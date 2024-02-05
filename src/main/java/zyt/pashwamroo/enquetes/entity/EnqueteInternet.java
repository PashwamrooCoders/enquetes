package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table
public class EnqueteInternet extends Enquete{


    @ManyToMany
    Set<SitePartenaire> sitePartenaires;

    public Set<SitePartenaire> getSitePartenaires() {
        return sitePartenaires;
    }

    public void setSitePartenaires(Set<SitePartenaire> sitePartenaires) {
        this.sitePartenaires = sitePartenaires;
    }
}
