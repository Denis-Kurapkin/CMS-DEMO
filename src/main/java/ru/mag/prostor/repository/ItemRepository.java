package ru.mag.prostor.repository;

import org.springframework.stereotype.Repository;
import ru.mag.prostor.model.entity.ImageEntity;
import ru.mag.prostor.model.entity.ItemEntity;

import java.util.List;

@Repository
public class ItemRepository {
    //select * from items order by total_sold desc limit 14  
    // TODO Добавить кастомный запрос, чтобы не загружать все картинки, а только главную
    public List<ItemEntity> getSaleHitItems() {
        return TEST_DATA;
    }

    //select * from items order by createdAt desc limit 14
    // TODO Добавить кастомный запрос, чтобы не загружать все картинки, а только главную
    public List<ItemEntity> getNewItems() {
        return TEST_DATA;
    }

    private final List<ImageEntity> TEST_IMAGE_DATA = List.of(
            new ImageEntity(
                    1,
                    "png",
                    "/images/stvol",
                    true
            ),
            new ImageEntity(
                    2,
                    "jpeg",
                    "/images/stvol-second",
                    false
            ),
            new ImageEntity(
                    3,
                    "jpeg",
                    "/images/stvol-second",
                    false
            )
    );


    private final List<ItemEntity> TEST_DATA = List.of(
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BERGARA BMR Steel к.22 LR",
                    118000.5,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    2131.54,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    131313.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    105550.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    1033300.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108666660.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    1011100.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    1080030.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    184000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ), new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            ),
            new ItemEntity(
                    "BROWNING BL-22 GRADE2 К.22 LR",
                    108000.0,
                    "/item-page",
                    3,
                    5,
                    "4212313",
                    TEST_IMAGE_DATA
            )
    );
}
