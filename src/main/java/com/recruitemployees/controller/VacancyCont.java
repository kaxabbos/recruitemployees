package com.recruitemployees.controller;

import com.recruitemployees.controller.main.Attributes;
import com.recruitemployees.model.Vacancy;
import com.recruitemployees.model.enums.VacancyStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacancy")
public class VacancyCont extends Attributes {

    @GetMapping
    public String Vacancy(Model model) {
        AddAttributesVacancy(model);
        return "vacancy";
    }

    @GetMapping("/under_consideration/{id}")
    public String VacancyUnder_consideration(@PathVariable Long id) {
        Vacancy vacancy = vacancyRepo.getReferenceById(id);
        vacancy.setStatus(VacancyStatus.UNDER_CONSIDERATION);
        vacancyRepo.save(vacancy);
        return "redirect:/vacancy";
    }

    @GetMapping("/rejected/{id}")
    public String VacancyRejected(@PathVariable Long id) {
        Vacancy vacancy = vacancyRepo.getReferenceById(id);
        vacancy.setStatus(VacancyStatus.REJECTED);
        vacancyRepo.save(vacancy);
        return "redirect:/vacancy";
    }
}
