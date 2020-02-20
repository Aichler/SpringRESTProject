package filmography.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "horsepower", nullable = false)
    @NotNull
    @Min(1)
    private Integer horsepower;

    @Column(name = "ownerid", nullable = false)
    @NotNull
    private long ownerId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Model> model ;

    public List<Model> getModel() {
        return model;
    }

    public void setModel(List<Model> model) {
        this.model = model;
    }


    public Car() {
    }

    public Car(long id, List model, Integer horsepower, long ownerId) {
        this.id = id;
        this.model = model;
        this.horsepower = horsepower;
        this.ownerId = ownerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

}

