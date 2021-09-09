package studios.restaurant;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem (Double price, String description, String category, Boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean setCategory(String category) {
        if (category.toLowerCase().contains("appetizer") || category.toLowerCase().contains("main course") ||
                category.toLowerCase().contains("dessert")) {
            this.category = category;
            return true;
        } else {
            return false;
        }
    }

    public String getCategory() {
        return this.category;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }

}
