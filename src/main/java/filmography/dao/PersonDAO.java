package filmography.dao;

import filmography.DTO.PersonDTO;
import filmography.model.Person;

import java.util.Date;
import java.util.List;

public interface PersonDAO {
    List<Person> allFilms();
    void delete(Person person);
    void edit(Person person);
    Person getById(int id);

    int filmsCount();

    boolean checkTitle(String title);

    void add(Person toEntity);
}
