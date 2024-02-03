package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.Enquete;

public interface EnqueteDao extends JpaRepository<Enquete,Long> {
}
