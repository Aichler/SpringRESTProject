package filmography.controller;

import filmography.DTO.PersonDTO;
import filmography.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import filmography.model.Person;
import filmography.service.PersonService;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/films", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getFilms(){
        return personService.allPerson();
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ResponseEntity addFilm(@RequestBody PersonDTO personDTO) {
        if (personDTO.personValidation()) {
            return ResponseEntity.badRequest()
                    .body("not null");
        }

        if (personService.idValidationPerson(personDTO.getId())) {
            return ResponseEntity.badRequest()
                    .body("not null");
        }
        personService.add(personDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
//
//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") int id,
//                                 @ModelAttribute("message") String message) {
//        Film film = personService.getById(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        modelAndView.addObject("film", film);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public ModelAndView editFilm(@ModelAttribute("film") Film film) {
//        ModelAndView modelAndView = new ModelAndView();
//        if (personService.checkTitle(film.getTitle()) || personService.getById(film.getId()).getTitle().equals(film.getTitle())) {
//            modelAndView.setViewName("redirect:/");
//            modelAndView.addObject("page", page);
//            personService.edit(film);
//        } else {
//            modelAndView.addObject("message","part with title \"" + film.getTitle() + "\" already exists");
//            modelAndView.setViewName("redirect:/edit/" +  + film.getId());
//        }
//        return modelAndView;
//    }
//
//    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
//    public ModelAndView deleteFilm(@PathVariable("id") int id) {
//        ModelAndView modelAndView = new ModelAndView();
//        int filmsCount = personService.filmsCount();
//        int page = ((filmsCount - 1) % 10 == 0 && filmsCount > 10 && this.page == (filmsCount + 9)/10) ?
//                this.page - 1 : this.page;
//        modelAndView.setViewName("redirect:/");
//        modelAndView.addObject("page", page);
//        Film film = personService.getById(id);
//        personService.delete(film);
//        return modelAndView;
//    }



}
