package com.conference.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requirements")
public class RequirementsController {

    @GetMapping
    public String showRequirements(Model model) {
        model.addAttribute("title", "Требования к оформлению статей");
        return "requirements";
    }
}