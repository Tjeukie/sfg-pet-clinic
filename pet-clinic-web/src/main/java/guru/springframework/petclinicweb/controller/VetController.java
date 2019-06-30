package guru.springframework.petclinicweb.controller;

import guru.springframework.petclinicdata.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        System.out.println("VetController - <constructor>");
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {
        System.out.println("VetController - listVets");
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
