package com.fooddeliverysystem;

import java.util.Scanner;

public class Main {
    FoodManager foodManager = new FoodManager();

    public static void main(String[] args) {
        GobiManchuriyan gobiManchuriyan = new GobiManchuriyan();
        gobiManchuriyan.price = 200;
        gobiManchuriyan.printMainIngredients();

        PaneerMasala paneerMasala = new PaneerMasala();
        paneerMasala.price = 150;
        paneerMasala.printMainIngredients();

        Biryani biryani = new Biryani();
        biryani.price = 250;
        biryani.printMainIngredients();

        Sweets sweets = new Sweets();
        sweets.price = 50;
        sweets.printMainIngredients();

        LemonJuice lemonJuice = new LemonJuice();
        lemonJuice.price = 80;
        lemonJuice.printMainIngredients();

        Main mainObj = new Main();

//        FoodManager foodManager = new FoodManager();
        mainObj.foodManager.add(biryani);
        mainObj.foodManager.add(gobiManchuriyan);
        mainObj.foodManager.add(lemonJuice);
        mainObj.foodManager.add(sweets);
        mainObj.foodManager.add(paneerMasala);

//        mainObj.foodManager.printFood();
//        System.out.println("the total food item in food list is : " + mainObj.foodManager.getFoodCount());
//
//        mainObj.foodManager.printFood();
//        mainObj.foodManager.printAllNonVegItem();
//        mainObj.foodManager.printAllVegItem();

        mainObj.showMenu();
        mainObj.updateFoodItem();

    }

   private void showMenu() {
        System.out.println("Enter 1 to update Food Item");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                updateFoodItem();
                break;
            default:
                System.out.println("invalid choice");
        }
    }


    private void updateFoodItem() {
        System.out.println("Enter food item to update");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        FoodItems foodItems = foodManager.getFoodItem(input);
        System.out.println(foodItems);

        System.out.println("enter 1 for change taste");
        System.out.println("enter 2 for change category");
        System.out.println("enter 3 for change preparation Time");
        System.out.println("enter 4 for change name");
        double parameter = sc.nextDouble();

        switch ((int) parameter){
            case 1:
                updateTaste(foodItems);
                break;
            case 2:
                updateCategory(foodItems);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(foodItems);
    }
    private void updateTaste(FoodItems foodItems){

        System.out.println("for change Taste");
        System.out.println("press 1 for Spicy");
        System.out.println("press 2 for Sweet");
        System.out.println("press 3 for Spicy-Salty");
        Scanner sc = new Scanner(System.in);
        int taste =  sc.nextInt();

        switch (taste){
            case 1:
                foodItems.taste = FoodItems.Taste.SPICY;
                break;
            case 2:
                foodItems.taste = FoodItems.Taste.SWEET;
                break;
            case 3:
                foodItems.taste = FoodItems.Taste.SPICY_SALTY;
                break;
            default:
                System.out.println("invalid choice");
        }
    }
    private void updateCategory(FoodItems foodItems){

        System.out.println("for change Category");
        System.out.println("press 1 for STARTER");
        System.out.println("press 2 for MAIN_COURSES");
        System.out.println("press 3 for DESSERT");
        System.out.println("press 4 for BEVERAGE");
        Scanner sc = new Scanner(System.in);
        int taste =  sc.nextInt();

        switch (taste){
            case 1:
                foodItems.category= FoodItems.Category.STARTER;
                break;
            case 2:
                foodItems.category= FoodItems.Category.MAIN_COURSE;
                break;
            case 3:
                foodItems.category= FoodItems.Category.DESSERT;
                break;
            case 4:
                foodItems.category= FoodItems.Category.BEVERAGE;
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}

