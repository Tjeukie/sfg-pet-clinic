package guru.springframework.petclinicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        System.out.println("IndexController - index");
        return "index";
    }
    
    @RequestMapping("/oups")
    public String oupsHandler() {
        System.out.println("IndexController - oupsHandler");
        
        return "notimplemented";
    }
}
