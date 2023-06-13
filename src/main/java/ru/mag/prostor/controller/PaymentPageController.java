package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.mag.prostor.model.dto.request.PaymentCardDto;

@Controller
public class PaymentPageController {
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("paymentCardDto", new PaymentCardDto());
    }

    @GetMapping("/payment")
    public String getPaymentPage() {
        return "payment";
    }

    @PostMapping("/payment")
    public String PostIntoPaymentPage(
            @ModelAttribute("paymentCardDto") PaymentCardDto paymentCardDto
    ) {
        System.out.println(paymentCardDto.getCardNumber());
        System.out.println(paymentCardDto.getCardMonth());
        System.out.println(paymentCardDto.getCardYear());
        System.out.println(paymentCardDto.getCardSecurity());
        return "redirect:/profile";
    }
}
