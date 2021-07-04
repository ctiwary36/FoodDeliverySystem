package com.fooddeliverysystem;

public class Biryani extends FoodItems implements INonVeg{
    public Biryani() {
        name = "Biryani";
        category=Category.MAIN_COURSE;
        taste=Taste.SPICY;
        preparationTime = 35;
    }

    public void printMainIngredients() {
        System.out.println("main ingredient of Biryani  is Rice and Chicken");
    }
}
