package ru.mag.prostor.service.impl;

import org.springframework.stereotype.Service;
import ru.mag.prostor.convert.ModelDtoConverter;
import ru.mag.prostor.model.dto.template.CategoriesDto;
import ru.mag.prostor.repository.CategoryRepository;
import ru.mag.prostor.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelDtoConverter modelConverter;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelDtoConverter modelConverter) {
        this.categoryRepository = categoryRepository;
        this.modelConverter = modelConverter;
    }

    @Override
    public CategoriesDto getCategories() {
        return modelConverter.convert(
                categoryRepository.getCategories()
        );
    }
}