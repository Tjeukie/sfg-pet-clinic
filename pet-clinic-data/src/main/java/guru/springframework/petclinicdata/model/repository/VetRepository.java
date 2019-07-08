package guru.springframework.petclinicdata.model.repository;

import guru.springframework.petclinicdata.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
