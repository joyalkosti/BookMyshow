package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class City extends Base_Model{
    private String Name;

    @OneToMany
    private List<Theatre> theatreList;

}
