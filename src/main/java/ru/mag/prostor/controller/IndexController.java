package ru.mag.prostor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.mag.prostor.service.ItemService;

@Controller
public class IndexController {
    private final ItemService itemService;

    public IndexController(ItemService itemService) {
        this.itemService = itemService;
    }

//    @ModelAttribute
//    public void addItems(Model model) {
//        model
//                .addAttribute(
//                        "newItems",
//                        itemService.getNewItems()
//                )
//                .addAttribute(
//                        "saleHitItems",
//                        itemService.getSaleHitItems()
//                );
//    }

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }
}
