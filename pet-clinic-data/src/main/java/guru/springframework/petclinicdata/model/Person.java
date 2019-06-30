package guru.springframework.petclinicdata.model;

public class Person extends BaseEntity {

    private String firstName;
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
