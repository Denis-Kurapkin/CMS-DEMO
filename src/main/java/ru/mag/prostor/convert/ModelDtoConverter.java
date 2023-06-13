package ru.mag.prostor.convert;

import ru.mag.prostor.model.dto.template.AboutCompanyDto;
import ru.mag.prostor.model.dto.template.CategoriesDto;
import ru.mag.prostor.model.dto.template.PreItemDto;
import ru.mag.prostor.model.entity.CategoryEntity;
import ru.mag.prostor.model.entity.CompanyInfoEntity;
import ru.mag.prostor.model.entity.ItemEntity;

import java.util.List;

public interface ModelDtoConverter {
    PreItemDto convert(ItemEntity item);

    CategoriesDto convert(List<CategoryEntity> categories);

    AboutCompanyDto convert(CompanyInfoEntity companyInfo);
}
