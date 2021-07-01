package com.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

    public class FoodManager {
         List <FoodItems> foodList = new ArrayList();

         public void add(FoodItems foodItems){
             foodList.add(foodItems);
         }

         public void printFood(){
             for (FoodItems elements: foodList) {
                 System.out.println(elements);
             }
         }
}
