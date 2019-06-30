package guru.springframework.petclinicdata.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //Box type instead of primitive
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
