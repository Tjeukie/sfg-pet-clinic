package guru.springframework.petclinicdata.service;

import guru.springframework.petclinicdata.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
