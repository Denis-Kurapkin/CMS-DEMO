package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllUserDataPageController {
    @GetMapping("/all-user-data")
    public String getAllUserDataPage(){
        return "all-user-data";
    }
}
