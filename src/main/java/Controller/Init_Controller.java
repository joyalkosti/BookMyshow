package Controller;

import Service.Init_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Init_Controller {

    @Autowired
    private Init_Service init_service;

    @GetMapping("/init")
    public ResponseEntity generateData(){
        return ResponseEntity.ok(init_service.initialise());
    }
}
