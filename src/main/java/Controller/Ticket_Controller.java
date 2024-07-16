package Controller;

import Service.Ticket_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ticket_Controller {

    @Autowired // Create the dependency object and inject inside controller
    private Ticket_Service ticket_service;

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet =ticket_service.greet();
        return ResponseEntity.ok(greet);

    }

}
