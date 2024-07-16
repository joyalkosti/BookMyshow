package Model;

import Model.Constant.Seat_Status;
import Model.Constant.Seat_Type;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seats extends Base_Model{
    private int row;
    private int col;
    private String Seat_Number;

    @Enumerated(EnumType.STRING) //Creates a Relationship b/w enum class and DB
    private Seat_Type seat_type;


    @Enumerated(EnumType.STRING) //Creates a Relationship b/w enum class and DB
    private Seat_Status seat_status;

    public Seats(){

    }

    public Seats(int row, int col, String seat_Number, Seat_Type seat_type, Seat_Status seat_status) {
        this.row = row;
        this.col = col;
        Seat_Number = seat_Number;
        this.seat_type = seat_type;
        this.seat_status = seat_status;
    }


}
