package filmography.service;

import filmography.DTO.CarDTO;
import filmography.dao.CarDAO;
import filmography.model.Car;
import filmography.model.Model;
import filmography.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Autowired
    CarDAO carDAO;

    @Override
    public void add(CarDTO carDTO) {
        carDAO.add(toEntity(carDTO));
    }

    @Override
    public Car getById(Long id) {
        return null;
    }

    private Car toEntity(CarDTO carDTO) {
        Car entity = new Car();
        Vendor vendor = new Vendor();
        Model model = new Model();
        entity.setId(carDTO.getId());
        entity.setHorsepower(carDTO.getHorsepower());
        String vendorWithoutModel = carDTO.getModel().split("-")[0];
        vendor.setVendor(vendorWithoutModel);
        List<Vendor> vendoradd = new ArrayList<>();
        vendoradd.add(vendor);
        String modelWithoutVendor = carDTO.getModel().substring(carDTO.getModel().indexOf('-') + 1);
        model.setModel(modelWithoutVendor);
        model.setVendor(vendoradd);
        List<Model> modeladd = new ArrayList<>();
        modeladd.add(model);
        entity.setId(carDTO.getId());
        entity.setModel(modeladd);
        entity.setOwnerId(carDTO.getOwnerId());
        return entity;
    }
}
