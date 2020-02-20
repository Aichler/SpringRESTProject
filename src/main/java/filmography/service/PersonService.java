package filmography.service;


import filmography.DTO.PersonDTO;
import filmography.model.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface PersonService {
    List<Person> allPerson();
    Person getById(Long id);
    int filmsCount();
    boolean idValidationPerson(Long id);
    void add(PersonDTO personDTO);
}
