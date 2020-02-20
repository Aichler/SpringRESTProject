package filmography.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    private Car car;

    @Column(name = "models", nullable = false)
    @NotNull
    private String model;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Vendor> vendor;


    public Model() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Vendor> getVendor() {
        return vendor;
    }

    public void setVendor(List<Vendor> vendor) {
        this.vendor = vendor;
    }

}