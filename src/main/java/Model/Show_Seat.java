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


    public Show_Seat(){

    }

    public Show_Seat(int price, Show show, Seats seats, Show_Seat_Status show_seat_status) {
        this.price = price;
        this.show = show;
        this.seats = seats;
        this.show_seat_status = show_seat_status;
    }
}
