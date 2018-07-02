package pl.javastart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import pl.javastart.model.City;
import pl.javastart.repository.CityRepository;

import java.util.List;

/**
 * @author Kaja D.
 */
//@EnableJpaRepositories
@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public City getCity(int cityId){
        return cityRepository.findOne(cityId);
    }

    public List<City> getCities(){
        return cityRepository.findAll();
    }

    public City createCity(City city){
        cityRepository.save(city);
        return city;
    }

    public City updateCity(City city){
        cityRepository.save(city);
        return city;
    }
}
