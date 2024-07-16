package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Model.City;


@Repository
public interface City_Repo extends JpaRepository <City, Integer>{
    City findCityByName(String Name);



}
