package com.fooddeliverysystem;

public class LemonJuice extends FoodItems implements IVeg{
    public LemonJuice() {
        name = "Lemon Juice";
        category=Category.BEVERAGE;
        taste=Taste.SWEET;
        preparationTime=15;
    }

    public void printMainIngredients() {
        System.out.println("main ingredient of lemon juice is lemon");
    }
}
