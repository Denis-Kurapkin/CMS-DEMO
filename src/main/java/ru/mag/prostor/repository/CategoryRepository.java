package ru.mag.prostor.repository;

import org.springframework.stereotype.Repository;
import ru.mag.prostor.model.entity.CategoryEntity;

import java.util.List;

@Repository
public class CategoryRepository {

    //select * from categories c where c.parent_category is null
    public List<CategoryEntity> getCategories() {
        CategoryEntity category1 = new CategoryEntity(
                "Оружие",
                List.of(
                        new CategoryEntity("Оружие нарезное", null),
                        new CategoryEntity("Оружие гладкоствольное", null),
                        new CategoryEntity("Комиссионное оружие", null)
                )
        );
        CategoryEntity category2 = new CategoryEntity(
                "Патроны",
                List.of(
                        new CategoryEntity("Патроны нарезные", null),
                        new CategoryEntity("Патроны гладкоствольные", null),
                        new CategoryEntity("Пули для пневматики", null)
                )
        );
        CategoryEntity category3 = new CategoryEntity(
                "Оптика",
                List.of(
                        new CategoryEntity("Прицелы дневные", null),
                        new CategoryEntity("Коллиматоры", null),
                        new CategoryEntity("Прицелы ночного видения", null)
                )
        );

        return List.of(
                category1,
                category2,
                category3
        );
    }
}