package guru.springframework.petclinicweb.bootstrap;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.service.OwnerService;
import guru.springframework.petclinicdata.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final OwnerService ownerService;
    private final VetService vetService;

    //No @Autowired required since Spring 4.
    public DataLoader(OwnerService ownerService, VetService vetService) {
        System.out.println("DataLoader - <constructor>");
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataLoader - run");
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        
        ownerService.save(owner1);
        
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        
        ownerService.save(owner2);
        
        System.out.println("Loaded Owners....");
        
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);
        
        Vet vet2 = new Vet();
        vet2.setFirstName("Jesse");
        vet2.setLastName("Porter");
        
        vetService.save(vet2);
        
        System.out.println("Loaded Vets....");
    }
    
}
