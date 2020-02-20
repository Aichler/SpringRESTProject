package filmography.controller;


import filmography.DTO.CarDTO;
import filmography.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CarController {


    CarService carService = new CarService();

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public void carAdd(@Valid @RequestBody CarDTO carDTO)
    {
//        Всяческая вализация.


        carService.add(carDTO);
        return;
    }

}
