package com.fooddelivery;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FoodManager {
    Set<FoodItem> foodList = new HashSet<>();

    void printFoodItems() {
        for (FoodItem i : foodList) {
            System.out.println(i);
        }
    }

    int countFoodItems(){
        return foodList.size();
    }

    FoodItem getFoodItem(String name) {
        Iterator iterator = foodList.iterator();
        for(FoodItem elements : foodList ) {
            if (iterator.hasNext()) {
                FoodItem fooditem = (FoodItem) iterator.next();
                if(fooditem.name.equalsIgnoreCase(name)) {
                    return fooditem;
                }
            }
        }
        return null;
    }

}
