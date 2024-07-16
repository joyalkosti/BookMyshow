package Service;

import Model.City;
import Model.Theatre;
import Repository.Theatre_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Theatre_Service {

    @Autowired
    private Theatre_Repo theatre_repo;

    @Autowired
    private City_Service city_service;

    public Theatre saveTheatre(String Name, String Address, int cityId){
        Theatre theatre=new Theatre();
        theatre.setName(Name);
        theatre.setAddress(Address);
        Theatre saveTheatre=theatre_repo.save(theatre);

        City city=city_service.getCityById(cityId);
        List<Theatre> theatreList=city.getTheatreList();
        theatreList.add(saveTheatre);
        city.setTheatreList(theatreList);
        city_service.saveCity(city);

        return saveTheatre;



    }
}
