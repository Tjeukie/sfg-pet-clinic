package guru.springframework.petclinicdata.service.springdatajpa;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.repository.OwnerRepository;
import guru.springframework.petclinicdata.repository.PetRepository;
import guru.springframework.petclinicdata.repository.PetTypeRepository;

import java.util.HashSet;
import java.util.Optional;

import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyLong;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    OwnerSDJpaService ownerSDJpaService;

    Owner returnOwner;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        ownerSDJpaService = new OwnerSDJpaService(ownerRepository, petRepository, petTypeRepository);
        
        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    public void testFindByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = ownerSDJpaService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    public void testFindAll() {
    Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1l).build());
        returnOwnersSet.add(Owner.builder().id(2l).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = ownerSDJpaService.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    public void testFindById() {
    when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerSDJpaService.findById(1L);

        assertNotNull(owner);
    }

   @Test
    public void testFindByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = ownerSDJpaService.findById(1L);

        assertNull(owner);
    }


    @Test
    public void testSave() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner = ownerSDJpaService.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());
    }

    @Test
    public void testDelete() {
        ownerSDJpaService.delete(returnOwner);

        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    public void testDeleteById() {
        ownerSDJpaService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }
}