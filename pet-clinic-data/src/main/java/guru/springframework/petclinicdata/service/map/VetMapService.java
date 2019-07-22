package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Specialty;
import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.service.SpecialtyService;
import guru.springframework.petclinicdata.service.VetService;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }
    
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

        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object
    ) {
        System.out.println("VetServiceMap - delete");
        super.delete(object);
    }

    @Override
    public void deleteById(Long id
    ) {
        System.out.println("VetServiceMap - deleteById");
        super.deleteById(id);
    }

}
