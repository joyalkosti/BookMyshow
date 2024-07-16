package Service;

import Dtos.City_DTO;
import Model.City;
import Repository.City_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class City_Service {

    @Autowired // All dependency automatically injected
    private City_Repo city_repo;

    public List<City> getAllCities(){
        return City_Repo.findAll();
    }

    public City getCityByName(String cityName){
        City city= city_repo.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId){
        return City_Repo.findById(cityId).get();
    }

    public  City SaveCity(String  cityName){
        City city=new City();
        city.setName(cityName);
        return City_Repo.save(city);

    }

    public City saveCity(City city){
        return City_Repo.save(city);
    }


    public boolean deleteCity(int cityId){
        city_repo.deleteById(cityId);
        return true;

    }
}
