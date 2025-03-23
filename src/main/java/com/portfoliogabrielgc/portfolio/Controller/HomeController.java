package com.portfoliogabrielgc.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframpackage com.portfoliogabrielgc.portfolio.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Dados do "Sobre Mim"
        model.addAttribute("nome", "Gabriel G. Caldeira");
        model.addAttribute("resumo", "Sou um desenvolvedor Java Junior apaixonado por tecnologia e soluções eficientes.");
        model.addAttribute("habilidades", new String[]{"Java", "Spring Boot", "Banco de Dados", "APIs REST", "Bootstrap"});
        model.addAttribute("linkedin", "https://www.linkedin.com/in/seu-perfil");
        model.addAttribute("github", "https://github.com/GabrielGCaldeira");

        return "sobre"; // Nome do arquivo HTML dentro de templates
    }
}
ework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("nome", "Gabriel Gomes Caldeira");
        return "sobre";
    }
}