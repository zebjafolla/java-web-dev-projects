package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String category = "";
    private String description;
    private boolean isNew;
    private boolean isOutOfStock;

    public MenuItem(String name, double price, String description, boolean isNew, boolean isOutOfStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
        this.isOutOfStock = isOutOfStock;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                "\nprice: " + price +
                "\ncategory: '" + category + '\'' +
                "\ndescription: '" + description + '\'' +
                "\nIs New Item: " + isNew +
                "\nOut of Stock: " + isOutOfStock + "\n";
    }

    public String getName() {
        return name;
    }

//    public void setCategory(String category) {
//        System.out.println(super.getMenuName());
//        System.out.println(this.category);
//        if (super.getMenuName().compareTo(this.category) == )
//        {
//            this.category = category;
//        }
//        else {
//            this.category += category + ", ";
//        }
//
//    }

    public void setCategory(String category) {
            if (this.category.isEmpty()) {
                this.category += category;
            }
            else{
                this.category += ", " + category;
            }
        }



    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean isOutOfStock() {
        return isOutOfStock;
    }
}