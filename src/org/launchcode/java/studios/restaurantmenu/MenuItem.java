package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private float price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(float price, String description, String category, Boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public Float getPrice() {
        return price;
    }
    public void setPrice(float aPrice) {
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

}

