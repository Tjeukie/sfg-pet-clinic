package guru.springframework.petclinicdata.service;

import guru.springframework.petclinicdata.model.Owner;


public interface OwnerService extends CrudService <Owner, Long> {

    Owner findByLastName(String lastName);

}
