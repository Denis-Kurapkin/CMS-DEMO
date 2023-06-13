package ru.mag.prostor.model.dto.template;

import java.util.List;

public class CategoriesDto {
    private final List<CategoryDto> category;

    public CategoriesDto(List<CategoryDto> category) {
        this.category = category;
    }

    public List<CategoryDto> getCategory() {
        return category;
    }
}
