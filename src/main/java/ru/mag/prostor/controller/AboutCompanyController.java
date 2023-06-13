package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.mag.prostor.service.AboutCompanyService;

@Controller
public class AboutCompanyController {
    private final AboutCompanyService aboutCompanyService;

    public AboutCompanyController(AboutCompanyService aboutCompanyService) {
        this.aboutCompanyService = aboutCompanyService;
    }

    @ModelAttribute
    public void addCompanyInfo(Model model) {
        model.addAttribute(
                "aboutCompany",
                aboutCompanyService.getAboutCompany()
        );
    }

    @GetMapping("/about-company")
    public String getAboutCompany(){
        return "about-company";
    }
}
