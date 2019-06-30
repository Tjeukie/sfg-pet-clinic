package guru.springframework.petclinicweb.controller;

import guru.springframework.petclinicdata.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        System.out.println("OwnerController - <constructor>");
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
         System.out.println("OwnerController - listOwners");
        model.addAttribute("owners", ownerService.findAll());
        
        return "owners/index";
    }
}
