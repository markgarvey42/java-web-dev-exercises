package org.launchcode.java.studios.restaurantmenu;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(Double price, String description, String category, Boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double aPrice) {
        price = aPrice;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }

    public Boolean getIsNew() {
        return isNew;
    }
    public void setIsNew(Boolean aIsNew) {
        isNew = aIsNew;
    }



    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

}

