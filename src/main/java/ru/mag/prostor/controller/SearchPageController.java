package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchPageController {

    @GetMapping("/search")
    public String getSearchPage(){
        return "search";
    }


}
