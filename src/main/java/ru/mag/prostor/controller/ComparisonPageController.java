package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComparisonPageController {
    @GetMapping("/comparison-page")
    public String getComparisonPage(){
        return "comparison-page";
    }
}
