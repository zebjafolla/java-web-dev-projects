package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> items = new ArrayList <MenuItem>();

    public String getItems() {
        String itemList = "Menu: " + menuName + "\n----------------";
        for (MenuItem item : this.items){
            itemList += "\n" + item.toString();
        }
        return itemList;
    }

    public void addItem(MenuItem item){
        items.add(item);
        item.setCategory(this.menuName);
    }
    public Menu(){
        this.menuName = "Default MenuName";
    }
    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return this.menuName;
    }
}