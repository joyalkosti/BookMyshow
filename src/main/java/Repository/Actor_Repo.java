package Repository;

import Model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Actor_Repo extends JpaRepository<Actor, Integer> {
}
