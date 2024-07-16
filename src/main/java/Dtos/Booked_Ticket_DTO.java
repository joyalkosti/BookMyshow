package Dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booked_Ticket_DTO {
    private List<Integer> showSeatIds;
     private Integer userId;
}
