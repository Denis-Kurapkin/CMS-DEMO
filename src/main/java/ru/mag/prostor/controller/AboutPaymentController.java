package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPaymentController {
    @GetMapping("/about-payment")
    public String getAboutPayment(){
        return "about-payment";
    }
}
