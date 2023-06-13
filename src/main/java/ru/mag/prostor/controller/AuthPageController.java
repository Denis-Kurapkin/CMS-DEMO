package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class AuthPageController {

    @GetMapping("/auth-page")
    public String getAuthPage(){
        return "auth-page";
    }


    @PostMapping("/auth-page")
    public String PostIntoAuthPage(@RequestParam("number") String phoneNumber){
      /*  if(!phoneNumber.isEmpty()){

        }*/

        return "redirect:/auth-page";
    }
}
