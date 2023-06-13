package ru.mag.prostor.convert.impl;

import org.springframework.stereotype.Component;
import ru.mag.prostor.convert.ModelDtoConverter;
import ru.mag.prostor.model.dto.template.*;
import ru.mag.prostor.model.entity.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelDtoConverterImpl implements ModelDtoConverter {

    @Override
    public PreItemDto convert(ItemEntity item) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        return new PreItemDto(
                item.getTitle(),
                item.getImages()
                        .stream()
                        .filter(ImageEntity::isMain)
                        .map(ImageEntity::getPath)
                        .findFirst()
                        .orElse(null),
                item.getItemPath(),
                decimalFormat.format(
                        item.getPrice()
                ),
                decimalFormat.format(
                        item.getDiscountPrice()
                )
        );
    }

    @Override
    public CategoriesDto convert(List<CategoryEntity> categories) {
        return new CategoriesDto(
                categories
                        .stream()
                        .map(c -> new CategoryDto(
                                        c.getTitle(),
                                        c.getChildCategory()
                                                .stream()
                                                .map(CategoryEntity::getTitle)
                                                .toList()
                                )
                        )
                        .collect(Collectors.toList())
        );
    }

    @Override
    public AboutCompanyDto convert(CompanyInfoEntity companyInfo) {
        return new AboutCompanyDto(
                Arrays.stream(
                                companyInfo.getDescription().split("\n")
                        )
                        .toList(),
                new ContactDto(
                        buildAddress(companyInfo.getAddress()),
                        companyInfo.getAddress().getMainPhoneNumber(),
                        companyInfo.getAddress().getSecondPhoneNumber()
                )
        );
    }

    private String buildAddress(AddressEntity address) {
        StringBuilder builder = new StringBuilder();
        builder
                .append("г. ")
                .append(address.getCity())
                .append(" ул. ")
                .append(address.getStreet())
                .append(" д. ")
                .append(address.getHouseNumber());
        if (address.getBuilding() != null) {
            builder.append(" к. ").append(address.getBuilding());
        }
        return builder.toString();
    }
}
