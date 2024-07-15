package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends Base_Model{
    private String Name;

    @ManyToMany
    private List<Movie> movieList;


}
