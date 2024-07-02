package br.com.treinaweb.spring_example;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    //@RequestParam não é obrigatório quando tem o mesmo nome
    @GetMapping("/teste5")
    public String action5(
        @RequestParam(
            name = "q", required = false, defaultValue = "Gustavo"
        ) String q,
        @RequestParam int age,
        @RequestParam List<String> skills
    ) {
        System.out.println(q);
        System.out.println(age);
        System.out.println(skills);
        return "teste";
    }  
    
    @GetMapping("/teste6/{id}")
    public String action6(@PathVariable Long id) {
        System.out.println(id);
        return "teste";
    }
}
