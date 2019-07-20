package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Specialty;
import guru.springframework.petclinicdata.service.SpecialtyService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        System.out.println("SpecialtyServiceMap - findAll");
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        System.out.println("SpecialtyServiceMap - findById");
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        System.out.println("SpecialtyServiceMap - save");
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        System.out.println("SpecialtyServiceMap - delete");
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("SpecialtyServiceMap - deleteById");
        super.deleteById(id);
    }

}
