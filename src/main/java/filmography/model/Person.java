package filmography.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthdate")
    @NotNull
    @Past
    private Date birthdate;

    @OneToMany
    private Set<Car> car;

    public Person() {
    }

    public Person(@NotNull long id, String lastName, @Past Date birthdate) {
        this.id = id;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

//    public Set<Car> getCar() {
//        return car;
//    }
//
//    public void setCar(Set<Car> car) {
//        this.car = car;
//    }

}

