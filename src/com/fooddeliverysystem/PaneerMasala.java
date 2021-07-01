package com.fooddeliverysystem;

public class PaneerMasala extends FoodItems implements IVeg{
    public PaneerMasala(){
        name = "Paneer Masala";
//        type=Type.VEG;
        category=Category.MAIN_COURSE;
        taste=Taste.SPICY;
        preparationTime=25;

    }
    public void printMainIngredients() {
        System.out.println("main ingredient of paneer masala is Paneer");
    }
}
