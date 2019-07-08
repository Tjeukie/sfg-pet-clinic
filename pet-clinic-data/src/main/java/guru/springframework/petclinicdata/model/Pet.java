package guru.springframework.petclinicdata.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

}
