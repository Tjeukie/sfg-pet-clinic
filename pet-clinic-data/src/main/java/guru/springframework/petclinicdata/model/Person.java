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
@AllArgsConstructor
@NoArgsConstructor
//Tells JPA we're going to inherit from this class
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //Hibernate uses 'snake-case'
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
}
