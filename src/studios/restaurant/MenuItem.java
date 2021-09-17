package studios.restaurant;

import java.util.*;
import java.text.DecimalFormat;

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

    public Boolean menuItemsEqual(MenuItem item1, MenuItem item2) {
        return item1.equals(item2);
    }

    public String toString() {
        DecimalFormat df2 = new DecimalFormat("#.##");
        String newText = "";
        if (isNew) {
            newText = " <--- New Item!";
        }
        return "Price: $"+df2.format(price) + " Description: " + description + " Category: " + category + newText;
    }

    public void printMenuItem() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(price, menuItem.price) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }

}
