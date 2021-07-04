package com.fooddeliverysystem;

public class GobiManchuriyan extends FoodItems implements IVeg{
    public GobiManchuriyan() {
        name = "Gobi Manchuriyan";
        category=Category.STARTER;
        taste=Taste.SPICY;
        preparationTime=20;
    }

    public void printMainIngredients() {
        System.out.println("main ingredient of Gobi Manchuriyan is Gobi");
    }
}
