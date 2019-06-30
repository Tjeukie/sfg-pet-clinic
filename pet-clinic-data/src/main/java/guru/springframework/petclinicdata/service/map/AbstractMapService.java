package guru.springframework.petclinicdata.service.map;

import guru.springframework.petclinicdata.model.BaseEntity;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        System.out.println("AbstractMapService - findAll");
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        System.out.println("AbstractMapService - findById");
        return map.get(id);
    }

    T save(T object) {
        System.out.println("AbstractMapService - save");
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void delete(T object) {
        System.out.println("AbstractMapService - delete");
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        System.out.println("AbstractMapService - deleteById");
        map.remove(id);
    }

    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;

        }

        return nextId;
    }
}
