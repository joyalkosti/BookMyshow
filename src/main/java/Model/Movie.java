package Model;

import Model.Constant.Movie_Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends Base_Model{
    private String name;
    private String Description;

    @ManyToMany
    private List<Actor> actorList;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Movie_Feature> movie_featureList;

    public Movie(){

    }

    public Movie(String name, String description) {
        this.name = name;
        this.Description = description;
    }


}
