package ru.mag.prostor.service;

import ru.mag.prostor.model.dto.template.PreItemDto;

import java.util.List;

public interface ItemService {
    List<PreItemDto> getSaleHitItems();
    List<PreItemDto> getNewItems();
}
