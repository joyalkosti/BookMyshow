package Repository;

import Model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Auditorium_Repo extends JpaRepository<Auditorium, Integer> {
    Auditorium findAuditoriumByName(String Name);

}
