package guru.springframework.petclinicdata.repository;

import guru.springframework.petclinicdata.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
