package filmography.dao;

import filmography.DTO.PersonDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import filmography.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;



@Repository
public class PersonDAOImpl implements PersonDAO {
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;


    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Person> allFilms() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Person").list();
//        return entityManager.createQuery("from Film", Film.class).setFirstResult(10 * (page - 1)).setMaxResults(10).getResultList();
    }



    @Override
    public void delete(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(person);
    }

    @Override
    public void edit(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);
    }

    @Override
    public Person getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Person.class, id);
    }

    @Override
    public int filmsCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from Person", Number.class).getSingleResult().intValue();
    }

    @Override
    public boolean checkTitle(String lastName) {
        Session session = sessionFactory.getCurrentSession();
        Query query;
        query = session.createQuery("from Person where lastName = :lastName");
        query.setParameter("lastName", lastName);
        return query.list().isEmpty();
    }

    @Override
    public void add(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(person);
    }
}
