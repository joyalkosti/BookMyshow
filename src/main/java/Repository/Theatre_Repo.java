package Repository;

import Model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Theatre_Repo extends JpaRepository<Theatre, Integer> {

}
