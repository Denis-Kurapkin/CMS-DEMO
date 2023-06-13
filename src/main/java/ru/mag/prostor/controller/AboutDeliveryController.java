package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutDeliveryController {
    @GetMapping("/about-delivery")
    public String getAboutDelivery(){
        return "about-delivery";
    }
}
