package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartPageAuthController {
    @GetMapping("/cart-page")
    public String getCartPageAuth(){
        return "cart-page";
    }
}
