package exspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Hi, we are Tomorrow by Together!!!");
        return "index";
    }

    @RequestMapping("/tabuada")
    public String tabuada(Model model) {
        int[] resultado = new int[10];
        for(int num = 1;num <= 10;num++) {
            resultado[num - 1] = num *2;
        }
        model.addAttribute("resultado", resultado);
        return "/tabuada";
    }
}
