package Repository;

import Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Payment_Repo extends JpaRepository<Payment, Integer> {
}
