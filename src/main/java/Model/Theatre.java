package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends Base_Model{

    private String Name;
    private String Address;

    public Theatre(String name, String address) {
        Name = name;
        Address = address;
    }

    public Theatre(){

    }

    @OneToMany
    private List<Auditorium> auditoriumList;


}
