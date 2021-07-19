package com.fooddelivery;

import java.util.Date;
import java.util.Scanner;

public class FoodMain {
    static FoodMain foodMain = new FoodMain();
    static Scanner sc = new Scanner(System.in);
    static FoodManager foodManager = new FoodManager();

    public static void main(String[] args) {
        FoodMain main =new FoodMain();
        main.showMenu();
    }

    void addFoodItem(){
        FoodItem foodItem = new FoodItem();
        System.out.println("Enter Food Name:");
        foodItem.name = sc.next();

        System.out.println("Enter Food Type:");
        System.out.println(" 1.VEG 2.NON-VEG ");
        int type = sc.nextInt();
        if(type == 1){
            foodItem.type = FoodItem.Type.VEG;
        }else{
            foodItem.type = FoodItem.Type.NON_VEG;
        }
        System.out.println("Enter Food Category");
        System.out.println("1.Main_Course" +
                "2.Starter " +
                "3.Snacks" +
                "4.Dessert");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItem.category = FoodItem.Category.MAIN_COURSE;
                break;
            case 2:
                foodItem.category = FoodItem.Category.STARTER;
                break;
            case 3:
                foodItem.category = FoodItem.Category.SNACKS;
                break;
            case 4:
                foodItem.category = FoodItem.Category.DESSERT;
                break;
            default:
                System.out.println("invalid option");
        }

        System.out.println("Enter Food Taste:");
        System.out.println("1.Spicy 2.Sweet 3.Sour 4.ExtraSpicy ");
        int choice1 = sc.nextInt();
        switch (choice1){
            case 1:
                foodItem.taste = FoodItem.Taste.SPICY;
                break;
            case 2:
                foodItem.taste = FoodItem.Taste.SWEET;
                break;
            case 3:
                foodItem.taste = FoodItem.Taste.SOUR;
                break;
            case 4:
                foodItem.taste = FoodItem.Taste.EXTRA_SPICY;
                break;
            default:
                System.out.println("invalid option");
        }

        System.out.println("Enter Preparation Time");
        foodItem.prepTime = sc.nextInt();

        System.out.println("Enter Price");
        foodItem.price = sc.nextInt();

        foodManager.foodList.add(foodItem);
    }

    void showMenu() {
        int choice = 0;
        while (choice != 10) {
            System.out.println(" Press 1: Add Food Item\n" +
                    " Press 2: Print Food Item\n" +
                    " Press 3: Update Food Item \n" +
                    " Press 4: Remove Food Item \n" +
                    " Press 5: Place Order \n" +
                    " Press 10: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addFoodItem();
                    break;
                case 2:
                    foodManager.printFoodItems();
                    break;
                case 3:
                    updateFoodItem();
                    break;
                case 4:
                    removeFoodItem();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 10:
                    choice = 10;
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }

    private void updateFoodItem() {
        System.out.println("1.Change taste ");
        System.out.println("2.Change price ");
        System.out.println("3.Change preparation time ");
        System.out.println("4.Change category ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                updateTaste();
                break;
            case 2:
                updatePrice();
                break;
            case 3:
                updatePrepTime();
                break;
            case 4:
                updateCategory();
                break;
            default:
                System.out.println("invalid option");
        }
    }

    private void updateCategory() {
        System.out.println("Enter food name ");
        String itemName = sc.next();
        FoodItem foodItem = foodManager.getFoodItem(itemName);
        System.out.println("1.MAIN_COURSE, 2.STARTER, 3.SNACKS, 4.DESSERT");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                foodItem.category = FoodItem.Category.MAIN_COURSE;
                break;
            case 2:
                foodItem.category = FoodItem.Category.STARTER;
                break;
            case 3:
                foodItem.category = FoodItem.Category.SNACKS;
                break;
            case 4:
                foodItem.category = FoodItem.Category.DESSERT;
                break;
            default:
                System.out.println("invalid option");
        }
    }

    private void updatePrepTime() {
        System.out.println("Enter Food Name:");
        String name = sc.next();
        FoodItem foodItem = foodManager.getFoodItem(name);
        System.out.println("Enter New Preparation Time:");
        foodItem.prepTime = sc.nextInt();
    }

    private void updatePrice() {
        System.out.println("Enter Food Name:");
        String name = sc.next();
        FoodItem foodItem = foodManager.getFoodItem(name);
        System.out.println("Enter New Price:");
        foodItem.price = sc.nextInt();
    }

    private void updateTaste() {
        System.out.println("Enter food name ");
        String itemName = sc.next();
        FoodItem foodItem = foodManager.getFoodItem(itemName);
        System.out.println("1.SPICY,2.SWEET,3.SOUR,4.EXTRA_SPICY");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItem.taste = FoodItem.Taste.SPICY;
                break;
            case 2:
                foodItem.taste = FoodItem.Taste.SWEET;
                break;
            case 3:
                foodItem.taste = FoodItem.Taste.SOUR;
                break;
            case 4:
                foodItem.taste = FoodItem.Taste.EXTRA_SPICY;
                break;
            default:
                System.out.println("invalid option");
        }
    }

    void removeFoodItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter food name to remove foodItem");
        String name = sc.nextLine();
        FoodItem foodItem = foodManager.getFoodItem(name);
        if(foodItem == null){
            System.out.println("sorry no food found");
        }else{
            System.out.println("you have removed " +foodItem.name);
            foodManager.foodList.remove(foodItem);
        }
    }

    void placeOrder(){
        Order order = new Order();

        System.out.println("please enter the Customer Name");
        order.customerName = sc.next();
        System.out.println("please enter the delivery address");
        order.deliveryAddress = sc.next();

        String itemName = " ";
        while(!itemName.equals("quit")) {
            System.out.println("Enter food name ");
            itemName = sc.next();
            FoodItem foodItem = foodManager.getFoodItem(itemName);
            if(foodItem != null) {
                System.out.println("please enter the Quantity");
                Integer quantity = sc.nextInt();
                order.map.put(foodItem, quantity);
            }else if (!itemName.equals("quit")){
                System.out.println("thank yuo for ordering");
                }
        }
        order.orderTime = new Date();
        System.out.println("=====================================");
        System.out.println("Your Order detail: ");
        System.out.println("------------------------------------");
        System.out.println("Your Food items are: ");
        foodManager.printFoodItems();
        System.out.println("Customer Name: "+order.customerName);
        System.out.println("Delivery Address: "+order.deliveryAddress);
        System.out.println("Quantity: "+order.map);
        System.out.println("Order Time: "+order.orderTime);
        System.out.println("Total Amount: "+order.totalAmount);
    }

}


