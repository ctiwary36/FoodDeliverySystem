package com.fooddeliverysystem;

import java.util.*;

public class FoodManager {
        Set<FoodItems> foodList = new HashSet<>();

         public void add(FoodItems foodItems) {
             foodList.add(foodItems);
         }

         FoodItems getFoodItem(String name){
             Iterator iterator = foodList.iterator();
             for (FoodItems elements : foodList){
                 if (iterator.hasNext()) {
                     FoodItems foodItems = (FoodItems) iterator.next();

                     if (foodItems.name.equalsIgnoreCase(name)) {
                      return foodItems;
                     }
                 }
             }
             return null;

         }

         void printFood() {
             for (FoodItems elements: foodList) {
                 System.out.println(elements);
             }
         }

         public void delete(FoodItems foodItems) {
             foodList.remove(foodItems);
         }
        public int getFoodCount() {
            return foodList.size();
        }
        public void printAllVegItem() {
            System.out.println("Printing all veg items");
            for (FoodItems elements : foodList) {
                if(elements instanceof  IVeg) {
                    System.out.println(elements);
                }
            }
        }

        public void printAllNonVegItem() {
            System.out.println("Printing all Non-veg items");
            for (FoodItems elements : foodList) {
                if(elements instanceof  INonVeg) {
                    System.out.println(elements);
                }
            }
        }
}
