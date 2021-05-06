package org.launchcode.java.studios.restaurantmenu;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
public class Menu {
    private ArrayList<MenuItem> menu;
    private Date dNow;

    public Menu(ArrayList<MenuItem> menu, Date dNow) {
        this.menu = menu;
        this.dNow = dNow;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }
    public Date getDNow() {
        return dNow;
    }
    public void setMenu(ArrayList<MenuItem> aMenu) {
        menu = aMenu;
    }
    public void setDNow(Date aDate) {
        dNow = aDate;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                ", dNow=" + dNow +
                '}';
    }

    public void addItem(MenuItem item) {
        menu.add(item);
        dNow = Calendar.getInstance().getTime();
    }

    public void removeItem(MenuItem item) {
        menu.remove(item);
        dNow = Calendar.getInstance().getTime();
    }

    public Boolean isItNew(MenuItem item) {
        return item.getIsNew();
    }

    public Date lastUpdated() {
        return dNow;
    }

    public void printItem(MenuItem item) {
        System.out.println(item.toString());
    }

    public void printMenu(Menu aMenu) {
        System.out.println(aMenu.toString());
    }

    public Boolean isEqual(MenuItem a, MenuItem b) {
        return a.equals(b);
    }

}