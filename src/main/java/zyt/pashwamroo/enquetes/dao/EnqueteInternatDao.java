package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.EnqueteInternet;

public interface EnqueteInternatDao extends JpaRepository<EnqueteInternet,Long> {
}
