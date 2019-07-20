package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.Visit;
import guru.springframework.petclinicdata.service.VisitService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    private final VisitService visitService;

    public VisitServiceMap(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll() {
        System.out.println("VisitServiceMap - findAll");
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        System.out.println("VisitServiceMap - findById");
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        System.out.println("VisitServiceMap - save");

        if (visit.getPet() == null
                || visit.getPet().getOwner() == null
                || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        } else {
            return super.save(visit);
        }
    }

    @Override
    public void delete(Visit object) {
        System.out.println("VisitServiceMap - delete");
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("VisitServiceMap - deleteById");
        super.deleteById(id);
    }
}
