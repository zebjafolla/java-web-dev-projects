package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Menu mainCourse = new Menu("Main Course");
        Menu appetizers = new Menu("Appetizers");
        Menu salads = new Menu("Salads");
        MenuItem burger = new MenuItem("Burger", 5.99, "Cheesy burger", true, false);
        MenuItem pizza = new MenuItem("Pizza", 10.99, "Sausage pizza", false, false);
        MenuItem nachos = new MenuItem("Nachos", 8.99, "Cheesy chippies", true, false);
        MenuItem pablanoPepper = new MenuItem("Pablano Pepper", 10.99,"A pepper", true, false);
        MenuItem caesarSalad = new MenuItem("Caesar Salad", 11.99, "Classic Caesar Salad", true, false);
        MenuItem gardenSalad = new MenuItem("Garden Salad", 5.99, "Fresh Garden Salad", true, false);
        salads.addItem(gardenSalad);
        salads.addItem(caesarSalad);
        appetizers.addItem(nachos);
        appetizers.addItem(caesarSalad);
        mainCourse.addItem(nachos);
        mainCourse.addItem(burger);
        mainCourse.addItem(pizza);
        appetizers.addItem(pablanoPepper);
        mainCourse.addItem(pablanoPepper);

//        System.out.println(salads.getItems());
        System.out.println(salads.getItem("salad"));
//        System.out.println(appetizers.getItems());
//        System.out.println(mainCourse.getItems());


    }
}