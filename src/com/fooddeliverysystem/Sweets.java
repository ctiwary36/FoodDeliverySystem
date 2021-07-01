package com.fooddeliverysystem;

public class Sweets extends FoodItems implements IVeg{
    public Sweets(){
        name= "Sweets";
//        type=Type.VEG;
        category=Category.DESSERT;
        taste=Taste.SWEET;
        preparationTime=10;
    }
    public void printMainIngredients() {
        System.out.println("main ingredient of Sweets is Milk And Sugar");
    }
}
