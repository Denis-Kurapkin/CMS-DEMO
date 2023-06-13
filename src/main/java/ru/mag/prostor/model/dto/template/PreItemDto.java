package ru.mag.prostor.model.dto.template;

public class PreItemDto {
    private final String title;
    private final String imagePath;
    private final String itemPath;
    private final String price;
    private final String discountPrice;

    public PreItemDto(String title, String imagePath, String itemPath, String price, String discountPrice) {
        this.title = title;
        this.imagePath = imagePath;
        this.itemPath = itemPath;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getItemPath() {
        return itemPath;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }
}
