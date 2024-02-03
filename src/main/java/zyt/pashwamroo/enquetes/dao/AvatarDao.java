package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.Avatar;

public interface AvatarDao extends JpaRepository<Avatar,Long> {
}
