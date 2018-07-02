package pl.javastart.repository;

import org.springframework.data.repository.CrudRepository;
import pl.javastart.model.City;

import java.util.List;

/**
 * @author Kaja D.
 */
public interface CityRepository extends CrudRepository<City, Integer>{
    public List<City> findAll();
}
