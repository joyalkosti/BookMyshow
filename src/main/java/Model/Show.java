package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends Base_Model{
    private LocalDateTime Start_time;
    private LocalDateTime End_time;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;


    private List<Show_Seat> show_seatList;
}
