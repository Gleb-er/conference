package com.conference.site.service;

import com.conference.site.model.Section;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Service
public class SectionService {

    private final List<Section> sections;

    public SectionService() {
        sections = Arrays.asList(
                new Section(1, "1",
                        "Теоретическая электротехника, метрология и электрические измерения",
                        LocalDate.of(2025, 4, 22),
                        LocalTime.of(15, 40),
                        "1-355",
                        "Пономарев Антон Витальевич, к.т.н., доцент, доцент кафедры \"Теоретическая электротехника\"",
                        "antonyswork@gmail.com"),

                new Section(2, "2",
                        "Безопасность жизнедеятельности и экология",
                        LocalDate.of(2025, 4, 24),
                        LocalTime.of(13, 55),
                        "3-505",
                        "Хмельницкий Юрий Николаевич, заведующий кафедрой БЖЭ, к.т.н., доцент.",
                        "bgemusatkina@mail.ru"),

                new Section(3, "3",
                        "Физика",
                        LocalDate.of(2025, 4, 24),
                        LocalTime.of(15, 40),
                        "1-310",
                        "Дроздова Илга Анатольевна, к.ф.-м.н., доцент",
                        "drozdovailga@mail.ru"),

                new Section(4, "4",
                        "Подвижной состав электрических железных дорог",
                        LocalDate.of(2025, 4, 23),
                        LocalTime.of(13, 15),
                        "1-120",
                        "Шиляков Андрей Петрович, к.т.н., доцент, заведующий кафедрой, доцент",
                        "eugentr@mail.ru")
        );
    }

    public List<Section> getAllSections() {
        return sections;
    }
}