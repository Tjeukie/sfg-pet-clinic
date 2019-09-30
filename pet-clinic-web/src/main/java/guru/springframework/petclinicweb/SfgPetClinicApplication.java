package guru.springframework.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.petclinicweb", "guru.springframework.petclinicdata", "guru.springframework.petclinicdata.repository"})

//@ComponentScan("guru.springframework.petclinicdata.repository")//to scan repository files
@EntityScan("guru.springframework.petclinicdata.model")
@EnableJpaRepositories("guru.springframework.petclinicdata.repository")

@ComponentScan(basePackages = {"guru.springframework.petclinicweb", "guru.springframework.petclinicdata"})
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        System.out.println("SfgPetClinicApplication - main");
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }

}