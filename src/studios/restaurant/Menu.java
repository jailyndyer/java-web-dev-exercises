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
}
