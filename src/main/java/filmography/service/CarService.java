package filmography.service;

import filmography.DTO.CarDTO;
import filmography.model.Car;
import filmography.model.Person;

import java.util.Date;

public interface CarService {
    void add(CarDTO carDTO);
    Car getById(Long id);
}
