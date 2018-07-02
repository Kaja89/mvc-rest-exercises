package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.javastart.model.City;
import pl.javastart.repository.CityRepository;
import pl.javastart.service.CityService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kaja D.
 */
@RestController
public class CityController {

    @Autowired
    CityService cityService;
    private List<City> cities = new ArrayList<>();

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable int cityId) {
        //return new City(5,"Warszawa", 1700000);
        return cityService.getCity( cityId);
    }

    @RequestMapping("/cities")
    public List<City> getCities() {
       // return cities;
        return cityService.getCities();
    }

    @RequestMapping(path = "/cities",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public City saveCity(@RequestBody City city) {
//        cities.add(city);
//        System.out.println(city);
        cityService.createCity(city);
        return city;
    }

    @RequestMapping(path="/cities", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public City updateCity(@RequestBody City city){
        cityService.updateCity(city);
        return city;
    }
}
