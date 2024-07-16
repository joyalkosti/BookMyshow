package Service;

import Model.Show_Seat;
import Repository.Show_Seat_Repo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Getter
@Setter
@Service
public class ShowSeat_Service {

    @Autowired
    private Show_Seat_Repo show_seat_repo;

    public Show_Seat get_show_seat(int showSeatId){
        return show_seat_repo.findById(showSeatId).get();
    }

    public Show_Seat saveShowSeat(Show_Seat seat){
        return show_seat_repo.save(seat); // save() -> upsert, means insert and update both
    }
}
