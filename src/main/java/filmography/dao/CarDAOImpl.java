package filmography.dao;

import filmography.DTO.CarDTO;
import filmography.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CarDAOImpl implements CarDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void add(Car toEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(toEntity);
    }

    @Override
    public Car getById(int id) {
        return null;
    }
}
