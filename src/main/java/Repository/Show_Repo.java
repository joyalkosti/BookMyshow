package Repository;

import Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Show_Repo extends JpaRepository<Show, Integer> {
}
