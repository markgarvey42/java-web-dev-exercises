package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();

        ArrayList<MenuItem> wholeFoods = new ArrayList<>();
        Menu wholeFoodsMenu = new Menu(wholeFoods, today);


        MenuItem apple = new MenuItem(.99, "A crisp apple", "Fruit", false);
        MenuItem banana = new MenuItem(.99, "A fresh banana", "Fruit", true);
        MenuItem corn = new MenuItem(1.99, "Mmmmm, Corn!", "Vegetable", false);


        wholeFoodsMenu.addItem(apple);
        wholeFoodsMenu.addItem(banana);
        wholeFoodsMenu.addItem(corn);

        wholeFoodsMenu.printMenu(wholeFoodsMenu);
        wholeFoodsMenu.printItem(apple);
        wholeFoodsMenu.removeItem(corn);
        wholeFoodsMenu.printMenu(wholeFoodsMenu);
    }
}
