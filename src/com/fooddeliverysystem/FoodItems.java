package com.fooddeliverysystem;
import java.util.Objects;

interface  IVeg{ }
interface  INonVeg{ }
public class FoodItems {
    enum Taste{SPICY, SWEET, SPICY_SALTY};
    enum Category{STARTER, MAIN_COURSE, DESSERT, BEVERAGE};
    Taste taste;
    float price;
    String name;
    Category category;
    byte preparationTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItems foodItem = (FoodItems) o;
        return Float.compare(foodItem.price, price) == 0 && preparationTime == foodItem.preparationTime && taste == foodItem.taste && category == foodItem.category && Objects.equals(name, foodItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taste, price, preparationTime, category, name);
    }

    @Override
    public String toString() {
        return "FoodItems{" +
                "name=" + name +
                ", category=" + category +
                ", taste=" + taste +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                '}';
    }
//    public abstract void printMainIngredients();
}
