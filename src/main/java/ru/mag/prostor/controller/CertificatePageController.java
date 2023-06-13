package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CertificatePageController {
    @GetMapping("/certificate")
    public String getCertificatePage(){
        return "certificate";
    }
}
