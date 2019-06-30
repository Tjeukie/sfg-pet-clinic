package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.service.OwnerService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(object);
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

}
