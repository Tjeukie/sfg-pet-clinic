package guru.springframework.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.petclinicweb", "guru.springframework.petclinicdata"})
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        System.out.println("SfgPetClinicApplication - main");
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }

}