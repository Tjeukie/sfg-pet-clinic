package guru.springframework.petclinicdata.model;

//Tells JPA we're going to inherit from this class
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

//Tells JPA we're going to inherit from this class
@MappedSuperclass
public class Person extends BaseEntity {

    //Hibernate uses 'snake-case'
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;

    public String getFirstName() {
        System.out.println("Person - getFirstName");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Person - setFirstName");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("Person - getLastName");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Person - setLastName");
        this.lastName = lastName;
    }

}
