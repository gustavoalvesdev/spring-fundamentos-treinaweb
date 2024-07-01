package br.com.treinaweb.spring_example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
    
    @GetMapping("/teste")
    public String action(ModelMap model) {
        
        model.addAttribute("nome", "Hildenberg");

        return "teste";
    }

}
