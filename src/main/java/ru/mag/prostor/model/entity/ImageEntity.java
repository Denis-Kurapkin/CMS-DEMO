package ru.mag.prostor.model.entity;

/**
 * @see <a href="https://medium.com/echohub/imageserver-with-spring-boot-postgresql-aec02e5dad9b">Example</a>
 */
public class ImageEntity {
    private int sortOrder;
    private ItemEntity item;
    private String mimeType;

    private byte[] data;
    private String path;
    private boolean isMain;

    public ImageEntity(int sortOrder, String mimeType, String path, boolean isMain) {
        this.sortOrder = sortOrder;
        this.mimeType = mimeType;
        this.path = path;
        this.isMain = isMain;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public ItemEntity getItem() {
        return item;
    }

    public String getMimeType() {
        return mimeType;
    }

    public byte[] getData() {
        return data;
    }

    public String getPath() {
        return path;
    }

    public boolean isMain() {
        return isMain;
    }
}
