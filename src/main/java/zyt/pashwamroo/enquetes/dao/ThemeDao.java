package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.Theme;

public interface ThemeDao extends JpaRepository<Theme,Long> {
}
