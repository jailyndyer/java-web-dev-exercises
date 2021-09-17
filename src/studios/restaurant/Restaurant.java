package studios.restaurant;

import java.util.*;

public class Restaurant {
    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem (11.99, "Black Bean Tofu", "main course", false));
        menuItems.add(new MenuItem (4.99, "Vegetable Spring Rolls", "appetizer", false));
        menuItems.add(new MenuItem (3.99, "Green Tea Ice Cream", "dessert", true));
        menuItems.add(new MenuItem (9.99, "Stir Fry String Beans", "main course", false));
        menuItems.add(new MenuItem (7.99, "Vegetable Pan Fried Dumplings", "appetizer", true));
        menuItems.add(new MenuItem (3.99, "Mango Ice Cream", "dessert", false));

        Menu menu = new Menu(menuItems);

        System.out.println("Full Menu");
        menu.printMenu(menuItems);
        System.out.println();

        System.out.println("One menu item");
        menuItems.get(1).printMenuItem();
        System.out.println();

        menu.removeMenuItem(menuItems.get(0));
        System.out.println("Full Menu");
        menu.printMenu(menuItems);
        System.out.println();
    }
}
