package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemPageController {
    @GetMapping("/item-page")
    public String getItemPage(){
        return "item-page";
    }
}
