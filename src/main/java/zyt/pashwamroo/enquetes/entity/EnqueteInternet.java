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
}
