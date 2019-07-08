package guru.springframework.petclinicdata.model.repository;

import guru.springframework.petclinicdata.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
