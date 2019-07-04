package guru.springframework.petclinicdata.model;

public class PetType extends BaseEntity {

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
