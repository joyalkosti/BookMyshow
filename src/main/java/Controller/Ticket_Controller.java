package Controller;

import Dtos.Booked_Ticket_DTO;
import Service.Ticket_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ticket_Controller {

    @Autowired // Create the dependency object and inject inside controller
    private Ticket_Service ticket_service;

    @GetMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody Booked_Ticket_DTO booked_ticket_dto){
        //Validate ticket request dto
        return ResponseEntity.ok(ticket_service.bookTicket(Booked_Ticket_DTO.getShowSeatIds(), Booked_Ticket_DTO.getUserId()));

    }

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet =ticket_service.greet();
        return ResponseEntity.ok(greet);

    }

}
