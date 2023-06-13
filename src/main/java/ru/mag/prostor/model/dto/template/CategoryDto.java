package ru.mag.prostor.model.dto.template;

import java.util.List;

public class CategoryDto {
    private final String categoryTitle;
    private final List<String> categoryChild;

    public CategoryDto(String categoryTitle, List<String> categoryChild) {
        this.categoryTitle = categoryTitle;
        this.categoryChild = categoryChild;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public List<String> getCategoryChild() {
        return categoryChild;
    }
}
