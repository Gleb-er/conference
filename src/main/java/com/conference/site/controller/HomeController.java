package com.conference.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("title", "XIII Всероссийская студенческая научная конференция");
        model.addAttribute("conferenceDate", "20–25 апреля 2026 года");
        model.addAttribute("university", "Омский государственный университет путей сообщения (ОмГУПС)");
        return "index";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}