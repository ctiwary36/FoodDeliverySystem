package com.fooddeliverysystem;

public class FoodItems {

    enum Taste{SPICY, SWEET, SPICY_SALTY};
    enum Category{STARTER, MAIN_COURSE, DESSERT, BEVERAGE};
    enum Type{VEG, NON_VEG}
    Category category;
    Type type;
    Taste taste;
    float price;
    String name;
    short preparationTime;

    @Override
    public String toString() {
        return "FoodItems{" +
                "name=" + name +
                ", category=" + category +
                ", type=" + type +
                ", taste=" + taste +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                '}';
    }

}
