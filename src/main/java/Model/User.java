package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="BMS_USER")
public class User extends Base_Model{
    private String Name;
    private String Email;

    @OneToMany
    private List<Ticket> ticketList;
}
