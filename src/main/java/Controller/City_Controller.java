package Controller;

import Dtos.City_DTO;
import Model.City;
import Service.City_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class City_Controller {

    @Autowired
    private City_Service city_service;

    //get the city
    @GetMapping("/City/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        City savedCity= city_service.getCityByName(cityName);
        return ResponseEntity.ok(savedCity); // we would return cityResponseDTO

    }

    @PostMapping("/City")
    public ResponseEntity createCity(@RequestBody City_DTO city_dto){
        try{
            String cityName = city_dto.getName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City Name is invalid");
            }
            City savedCity = city_service.SaveCity(cityName);
            return ResponseEntity.ok(savedCity); // we would return cityResponseDTO
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //Delete data request
    @DeleteMapping("/City/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId){
        boolean isDelete =city_service.deleteCity(cityId);
        return ResponseEntity.ok(isDelete);

    }
}
