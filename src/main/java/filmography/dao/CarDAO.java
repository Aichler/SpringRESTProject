package filmography.dao;

import filmography.DTO.CarDTO;
import filmography.model.Car;
import filmography.model.Person;

public interface CarDAO {
    void add(Car toEntity);
    Car getById(int id);
}
