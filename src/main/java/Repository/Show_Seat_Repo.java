package Repository;

import Model.Show_Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Show_Seat_Repo extends JpaRepository<Show_Seat, Integer> {
}
