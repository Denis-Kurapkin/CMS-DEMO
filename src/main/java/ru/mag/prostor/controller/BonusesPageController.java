package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BonusesPageController {
    @GetMapping("/bonuses")
    public String getBonusesPage(){
        return "bonuses";
    }
}
