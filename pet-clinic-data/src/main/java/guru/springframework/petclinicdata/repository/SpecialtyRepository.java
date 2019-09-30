package guru.springframework.petclinicdata.repository;

import guru.springframework.petclinicdata.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
