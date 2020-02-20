package filmography.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

public class PersonDTO {
    @NotNull
    private long id;

    @NotNull
    private String lastName;

    @NotNull
    @Past
    private Date birthdate;

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

    public boolean personValidation() {
        return (this.getBirthdate() == null || this.getLastName() == null || this.getId() == 0);
    }
}

