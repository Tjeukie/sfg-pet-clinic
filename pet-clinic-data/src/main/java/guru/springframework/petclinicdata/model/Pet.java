package guru.springframework.petclinicdata.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        System.out.println("Pet - getPetType");
        return petType;
    }

    public void setPetType(PetType petType) {
        System.out.println("Pet - setPetType");
        this.petType = petType;
    }

    public Owner getOwner() {
        System.out.println("Pet - getOwner");
        return owner;
    }

    public void setOwner(Owner owner) {
        System.out.println("Pet - setOwner");
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
