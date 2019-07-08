package guru.springframework.petclinicdata.model.repository;

import guru.springframework.petclinicdata.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
