package ru.mag.prostor.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.mag.prostor.service.CategoryService;

@ControllerAdvice
public class GlobalAttributeAdvice {
    private final CategoryService categoryService;


    public GlobalAttributeAdvice(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @ModelAttribute
    public void addCategories(Model model) {
        model.addAttribute(
                "categories",
                categoryService.getCategories()
        );
    }
}