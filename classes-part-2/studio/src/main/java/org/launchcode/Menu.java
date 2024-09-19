package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private final String menuName;
    private final ArrayList<MenuItem> items = new ArrayList <MenuItem>();

    public String getItems() {
        String itemList = "Menu: " + menuName + "\n----------------";
        for (MenuItem item : this.items){
            itemList += "\n" + item.toString();
        }
        return itemList;
    }

    public void addItem(MenuItem item) {
        item.setCategory(getMenuName());
        this.items.add(item);
    }

    public void removeItem(Menu item){

    }

    public String getItem(String str) {
        String itemLowerCase;
        String matchingItems = "";
//        ArrayList<MenuItem> foundItems = new ArrayList<MenuItem>();
        for (MenuItem item : items) {
            itemLowerCase = item.getName().toLowerCase();
            if (itemLowerCase.contains(str.toLowerCase())) {
                matchingItems += "\n" + item.toString();
//                foundItems.add(item);
            }
        }
        if (matchingItems.isEmpty()){
            return "No item with name " + '\'' + str + '\'' + " found in the " + getMenuName() + " menu.";
        }
        return matchingItems;
//        else if (foundItems.size() > 1)
//        {
//            for (MenuItem item : foundItems)
//            {
//
//            }
        }



    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return this.menuName;
    }
}