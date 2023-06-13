package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartPageUnAuthController {
    @GetMapping("/cart-page-unauth")
    public String getCartPageUnAuth(){
        return "cart-page-unauth";
    }
}
