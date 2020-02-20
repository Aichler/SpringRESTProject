package filmography.service;

import filmography.DTO.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import filmography.dao.PersonDAO;
import filmography.model.Person;

import java.util.List;
import java.util.Date;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    @Autowired
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public List<Person> allPerson() {
        return personDAO.allFilms();
    }

    @Override
    public Person getById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void add(PersonDTO personDTO) {
        personDAO.add(toEntity(personDTO));
    }

    private Person toEntity(PersonDTO personDTO) {
        Person entity = new Person();
        entity.setId(personDTO.getId());
        entity.setLastName(personDTO.getLastName());
        entity.setBirthdate(personDTO.getBirthdate());
        return entity;
    }


    @Override
    @Transactional
    public int filmsCount() {
        return personDAO.filmsCount();
    }

    @Override
    public boolean idValidationPerson(Long id) {
        return false;
    }



}
