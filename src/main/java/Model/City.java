package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends Base_Model{

    private String Name;

    @OneToMany
    private List<Theatre> theatreList;

    public City() {

    }

    public City(String name) {
        Name = name;
    }
}
