package guru.springframework.petclinicdata.repository;

import guru.springframework.petclinicdata.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
