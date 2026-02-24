package com.conference.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/curator")
public class CuratorController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Вход для кураторов");
        return "curator/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("title", "Информация для кураторов");

        model.addAttribute("conferenceInfo",
                "На базе университета в период с 20 по 25 апреля 2026 года пройдет " +
                        "XIII Всероссийская студенческая научная конференция с международным участием " +
                        "«Студент: наука, профессия, жизнь».");

        model.addAttribute("deadlines",
                "8 апреля – окончание приема заявок\n" +
                        "9-16 апреля – формирование программы конференции\n" +
                        "19 апреля – окончание приема материалов статей\n" +
                        "20-25 апреля – очно-дистанционная работа секций\n" +
                        "30 апреля – окончание приема протоколов секций\n" +
                        "10 мая – окончание приема статей студентов\n" +
                        "до 30 июня – издание сборника трудов");

        return "curator/dashboard";
    }
}