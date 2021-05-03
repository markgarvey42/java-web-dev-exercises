package org.launchcode.java.studios.restaurantmenu;

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


}