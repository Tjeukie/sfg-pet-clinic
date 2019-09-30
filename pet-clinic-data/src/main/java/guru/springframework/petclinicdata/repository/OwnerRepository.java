package guru.springframework.petclinicdata.repository;

import guru.springframework.petclinicdata.model.Owner;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
