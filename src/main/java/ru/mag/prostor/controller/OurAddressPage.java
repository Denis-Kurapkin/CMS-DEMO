package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OurAddressPage {
    @GetMapping("/our-address")
    public String getOurAddressPage(){
        return "our-address";
    }
}
