package ru.mag.prostor.service.impl;

import org.springframework.stereotype.Service;
import ru.mag.prostor.convert.ModelDtoConverter;
import ru.mag.prostor.model.dto.template.PreItemDto;
import ru.mag.prostor.repository.ItemRepository;
import ru.mag.prostor.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    private final ModelDtoConverter modelConverter;

    public ItemServiceImpl(
            ItemRepository itemRepository,
            ModelDtoConverter modelConverter) {
        this.itemRepository = itemRepository;
        this.modelConverter = modelConverter;
    }

    @Override
    public List<PreItemDto> getSaleHitItems() {
        return itemRepository
                .getSaleHitItems()
                .stream()
                .map(modelConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public List<PreItemDto> getNewItems() {
        return itemRepository
                .getNewItems()
                .stream()
                .map(modelConverter::convert)
                .collect(Collectors.toList());
    }
}
