package br.com.treinaweb.spring_example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TesteController {
    
    @GetMapping("/teste")
    public String action(ModelMap model) {
        
        model.addAttribute("nome", "Hildenberg");

        return "teste";
    }

    @GetMapping("/teste2")
    public ModelAndView action2() {
        // var modelAndView = new ModelAndView("teste");
        // modelAndView.addObject("nome", "Gustavo");
        // return modelAndView;
        return new ModelAndView("teste", Map.of("nome", "Gustavo"));
    }

    @GetMapping("/teste3")
    public String action3(Model model) {
        model.addAttribute("client", new Client("Gustavo", 32));
        return "form";
    }

    @PostMapping("/teste3")
    public String action4(Client client) {
        System.out.println(client);
        return "form";
    }
    
    
}
