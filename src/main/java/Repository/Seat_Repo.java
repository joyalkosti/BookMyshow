package Repository;

import Model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Seat_Repo extends JpaRepository<Seats, Integer> {
    Seats findSeatBySeatNumber(String seatNumber);

}
