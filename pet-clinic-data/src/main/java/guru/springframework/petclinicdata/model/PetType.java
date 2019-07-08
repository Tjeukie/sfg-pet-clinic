package guru.springframework.petclinicdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        System.out.println("PetType - getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("PetType - setName");
        this.name = name;
    }

}
