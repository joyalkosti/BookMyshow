package Model;

import Model.Constant.Auditorium_Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Auditorium extends Base_Model{
    private String Name;
    private int Capacity;

    @OneToMany
    private List<Show> showList;

    @OneToMany
    private List<Seats> seatsList;

    @ElementCollection //Used when Enum is Multiple ex. a dataStructure = List, Set
    @Enumerated(EnumType.STRING) //Creates a Relationship b/w enum class and DB

    private List<Auditorium_Feature> auditorium_featureList;



}
