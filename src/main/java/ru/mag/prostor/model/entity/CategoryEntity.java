package ru.mag.prostor.model.entity;

import java.util.List;

/**
 * У категорий будет древовидная зависимость с уровнем вложенности 2.
 * Оружие - > Гладкоствольное Нарезное
 * Патроны -> нарезные гладкоствольные пневматические
 *
 * <a href="https://ballistica.su/store/">Пример на сайте</a>
 */
public class CategoryEntity {
    private String title;

    private List<CategoryEntity> childCategory;

    public CategoryEntity(String title, List<CategoryEntity> childCategory) {
        this.title = title;
        this.childCategory = childCategory;
    }

    public String getTitle() {
        return title;
    }

    public List<CategoryEntity> getChildCategory() {
        return childCategory;
    }
}
