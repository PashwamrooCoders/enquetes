package zyt.pashwamroo.enquetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import zyt.pashwamroo.enquetes.entity.Question;

public interface QuestionDao extends JpaRepository<Question,Long> {
}
