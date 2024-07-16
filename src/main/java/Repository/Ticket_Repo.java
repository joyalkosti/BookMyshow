package Repository;

import Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ticket_Repo extends JpaRepository<Ticket, Integer> {
}
