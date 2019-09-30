package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Pet;
import guru.springframework.petclinicdata.service.PetService;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
   
    @Override
    public Set<Pet> findAll() {
        System.out.println("PetServiceMap - findAll");     
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        System.out.println("PetServiceMap - findById"); 
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        System.out.println("PetServiceMap - save"); 
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        System.out.println("PetServiceMap - delete"); 
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("PetServiceMap - deleteById"); 
        super.deleteById(id);
    }

}
