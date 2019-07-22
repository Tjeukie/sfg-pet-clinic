package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.model.Pet;
import guru.springframework.petclinicdata.service.OwnerService;
import guru.springframework.petclinicdata.service.PetService;
import guru.springframework.petclinicdata.service.PetTypeService;
import java.util.List;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        System.out.println("OwnerServiceMap - <constructor>");
        this.petTypeService = petTypeService;
        this.petService = petService;
    }
    
    @Override
    public Set<Owner> findAll() {
        System.out.println("OwnerServiceMap - findAll");
        return super.findAll();
    }
    
    @Override
    public Owner findById(Long id) {
        System.out.println("OwnerServiceMap - findById");
        return super.findById(id);
    }
    
    @Override
    public Owner save(Owner object) {
        System.out.println("OwnerServiceMap - save");
        
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
                
            }
            return super.save(object);
        } else {
            return null;
        }
    }
    
    @Override
    public void delete(Owner object) {
        System.out.println("OwnerServiceMap - delete");
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id) {
        System.out.println("OwnerServiceMap - deleteById");
        super.deleteById(id);
    }
    
    @Override
    public Owner findByLastName(String lastName) {
        System.out.println("OwnerServiceMap - findByLastName");
        return null;
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
