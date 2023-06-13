package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlobalPageController {
    @GetMapping("/global")
    public String getGlobalPage(){
        return "global";
    }
}
