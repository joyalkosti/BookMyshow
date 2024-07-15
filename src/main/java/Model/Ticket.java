package Model;

import Model.Constant.Ticket_Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends Base_Model{
    private LocalDateTime TimeOfBooking;
    private double TotalAmount;

    @OneToMany
    private List<Show_Seat> show_seatList;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private Ticket_Status ticket_status;


}
