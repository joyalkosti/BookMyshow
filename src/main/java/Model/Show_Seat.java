package Model;

import Model.Constant.Show_Seat_Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show_Seat {
    private int price;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seats seats;

    @Enumerated(EnumType.STRING)
    private Show_Seat_Status show_seat_status;
}
