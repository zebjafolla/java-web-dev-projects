package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MenuItem> items = new ArrayList<MenuItem>();

        MenuItem burger = new MenuItem("Burger", 5.99, "Main course", "Cheesy burger", true, false);
        items.add(burger);
        MenuItem pizza = new MenuItem("Pizza", 10.99, "Main course", "Sausage pizza", false, false);
        items.add(pizza);
        Menu mainCourse = new Menu("Main Course", items);
        Menu appetizers = new Menu("Appetizers", items);

        System.out.println(mainCourse.getItems().get(0).getName());
        System.out.println(appetizers.getItems().get(1).getName());
    }
}