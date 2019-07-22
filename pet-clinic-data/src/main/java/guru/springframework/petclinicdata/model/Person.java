package guru.springframework.petclinicdata.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

//Tells JPA we're going to inherit from this class
@Getter
@Setter
//Tells JPA we're going to inherit from this class
@MappedSuperclass
public class Person extends BaseEntity {

    //Hibernate uses 'snake-case'
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
}
