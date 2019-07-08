package guru.springframework.petclinicdata.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Tells JPA we're going to inherit from this class
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        System.out.println("BaseEntity - getId");
        return id;
    }

    public void setId(Long id) {
        System.out.println("BaseEntity - setId");
        this.id = id;
    }
    
}
