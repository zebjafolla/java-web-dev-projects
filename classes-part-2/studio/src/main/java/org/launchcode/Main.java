package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        MenuItem burger = new MenuItem("Burger", 5.99, "Cheesy burger", true, false);
        MenuItem pizza = new MenuItem("Pizza", 10.99, "Sausage pizza", false, false);
        Menu mainCourse = new Menu("Main Course");
        Menu appetizers = new Menu("Appetizers");
        MenuItem nachos = new MenuItem("Nachos", 8.99, "Cheesy chippies", true, false);
        MenuItem pablanoPepper = new MenuItem("Pablano", 10.99,"A pepper", true, false);
        appetizers.addItem(nachos);
        mainCourse.addItem(nachos);
        mainCourse.addItem(burger);
        mainCourse.addItem(pizza);
        appetizers.addItem(pablanoPepper);

        System.out.println(mainCourse.getItems());
        System.out.println(appetizers.getItems());


    }
}