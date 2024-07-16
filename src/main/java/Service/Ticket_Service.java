package Service;

import Model.Constant.Show_Seat_Status;
import Model.Show_Seat;
import Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class Ticket_Service {

    @Autowired
    private ShowSeat_Service showSeat_service;


    @Transactional(isolation= Isolation.SERIALIZABLE)
    // you don't pass dtos to service, instead pull out the required data and pass it to service
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {

        // Checking id the Selected seats are available
        for(int showSeatId: showSeatIds){
            Show_Seat Seat=showSeat_service.get_show_seat(showSeatId);
            if(!Seat.getShow_seat_status().equals(Show_Seat_Status.AVAILABLE)){
                throw new Exception("Seat is not Available");
            }
        }
        // Updating a seats to a locked state
        for(int showSeatId: showSeatIds){
            Show_Seat Seat=showSeat_service.get_show_seat(showSeatId);
            Seat.setShow_seat_status(Show_Seat_Status.LOCKED);
            showSeat_service.saveShowSeat(Seat);

        }
        startPayment(showSeatIds);
        // Write a logic for Payment flow
        return new Ticket();
    }

    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }

    public String greet() {
        return null;
    }
}
