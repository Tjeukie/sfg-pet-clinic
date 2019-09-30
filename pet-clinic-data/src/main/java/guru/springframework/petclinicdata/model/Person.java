package guru.springframework.petclinicdata.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Tells JPA we're going to inherit from this class
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Tells JPA we're going to inherit from this class
@MappedSuperclass
public class Person extends BaseEntity {

    //Hibernate uses 'snake-case'
    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;
}
