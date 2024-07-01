package br.com.treinaweb.spring_example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TesteController {
    
    //@RequestMapping(path = "/teste", method = RequestMethod.POST)
    @GetMapping("/teste")
    public String action() {
        System.out.println("Olá, Treinaweb!");
        return "Treinaweb";
    }

}
