package com.conference.site.controller;

import com.conference.site.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sections")
public class SectionsController {

    private final SectionService sectionService;

    @Autowired
    public SectionsController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @GetMapping
    public String showSections(Model model) {
        model.addAttribute("sections", sectionService.getAllSections());
        model.addAttribute("title", "Секции конференции");
        return "sections";
    }
}