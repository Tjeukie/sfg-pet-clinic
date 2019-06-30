package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.service.VetService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        System.out.println("VetServiceMap - findAll");
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        System.out.println("VetServiceMap - findById");
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        System.out.println("VetServiceMap - save");
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        System.out.println("VetServiceMap - delete");
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("VetServiceMap - deleteById");
        super.deleteById(id);
    }

}
