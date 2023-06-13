package ru.mag.prostor.model.entity;

import java.time.Instant;
import java.util.List;

public class ItemEntity {
    private String title;
    private double price;
    private double discountPrice = 100.0;
    private int quantity;
    private int totalSold;
    private String article;

    private String itemPath;
    private String description;
    private Instant createdAt;

    private CategoryEntity category;

    private List<FeedbackEntity> feedbacks;
    private List<ImageEntity> images;

    public ItemEntity(
            String title,
            double price,
            String itemPath,
            int quantity,
            int totalSold,
            String article,
            List<ImageEntity> images) {
        this.title = title;
        this.price = price;
        this.itemPath = itemPath;
        this.quantity = quantity;
        this.totalSold = totalSold;
        this.article = article;
        this.images = images;
        description = "Описание товара";
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getItemPath() {
        return itemPath;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public String getArticle() {
        return article;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public List<FeedbackEntity> getFeedbacks() {
        return feedbacks;
    }

    public List<ImageEntity> getImages() {
        return images;
    }
}
