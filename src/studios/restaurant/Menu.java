package studios.restaurant;
import java.util.*;

public class Menu {
    private MenuItem menuItem;
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated = new Date();

    public Menu (ArrayList menuItems) {
        this.menuItems = menuItems;
        lastUpdated = new Date();
    }

    public void addMenuItem(Double price, String description, String category, Boolean isNew) {
        menuItem = new MenuItem(price, description, category, isNew);
        menuItems.add(menuItem);
        lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem removeItem) {
        this.menuItems.remove(removeItem);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void printMenu(ArrayList<MenuItem> items) {
        for (MenuItem anItem : items) {
            System.out.println(anItem.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuItem, menu.menuItem) && Objects.equals(menuItems, menu.menuItems) && Objects.equals(lastUpdated, menu.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItem, menuItems, lastUpdated);
    }
}
