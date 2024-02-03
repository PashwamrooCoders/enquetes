package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {
}
