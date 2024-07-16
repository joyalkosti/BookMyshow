package Controller;

import Dtos.Theatre_DTO;
import Service.Theatre_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Theatre_Controller {
    @Autowired
    private Theatre_Service theatreService;

    @PostMapping("/theatre")
    public ResponseEntity createTheatre(@RequestBody Theatre_DTO theatre_dto){
        return ResponseEntity.ok(theatreService.saveTheatre(theatre_dto.getName(), theatre_dto.getAddress(), theatre_dto.getCityId()));
    }
}
