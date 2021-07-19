package com.fooddeliverysystem;

import java.util.Scanner;

public class Main {
    FoodManager foodManager = new FoodManager();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        GobiManchuriyan gobiManchuriyan = new GobiManchuriyan();
//        gobiManchuriyan.price = 200;
//
//        PaneerMasala paneerMasala = new PaneerMasala();
//        paneerMasala.price = 150;
//
//        Biryani biryani = new Biryani();
//        biryani.price = 250;
//
//        Sweets sweets = new Sweets();
//        sweets.price = 50;
//
//        LemonJuice lemonJuice = new LemonJuice();
//        lemonJuice.price = 80;
//
//        Main mainObj = new Main();
//
//        mainObj.foodManager.add(biryani);
//        mainObj.foodManager.add(gobiManchuriyan);
//        mainObj.foodManager.add(lemonJuice);
//        mainObj.foodManager.add(sweets);
//        mainObj.foodManager.add(paneerMasala);
        Main mainObj = new Main();
        mainObj.showMenu();
    }

   private void showMenu() {
       Scanner sc = new Scanner(System.in);
       int choice = 0;
       while (choice != 10) {
           System.out.println("Enter 1 to update Food Item");
           System.out.println("Enter 2 to view menu");
           System.out.println("Enter 2 to add food Item");
           System.out.println("Enter 10 to Exit");
           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   updateFoodItem();
                   break;
               case 2:
                   foodManager.printFood();
                   break;
               case 3:
                   addFoodItem();
               case 10:
                   System.out.println("you Exited the menu");
                   break;
               default:
                   System.out.println("invalid choice");
                   break;
           }
       }
   }
    private void updateFoodItem() {
        System.out.println("Enter food item to update");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        FoodItems foodItems = foodManager.getFoodItem(input);
        System.out.println(foodItems);

        int parameter = 0;
        while ( parameter != 5) {
            System.out.println("enter 1 for change taste");
            System.out.println("enter 2 for change category");
            System.out.println("enter 3 for change preparation Time");
            System.out.println("enter 4 for change name");
            System.out.println("enter 5 to return to main menu");
            parameter = sc.nextInt();

            switch ( parameter ) {
                case 1:
                    updateTaste(foodItems);
                    break;
                case 2:
                    updateCategory(foodItems);
                    break;
                case 3:
                    updatePreprationTime(foodItems);
                    break;
                case 4:
                    updateName(foodItems);
                    break;
                case 5:
                    System.out.println("you have been return to main menu");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println(foodItems);
        }
    }

    private void updateTaste(FoodItems foodItems) {
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
                foodItems.category = FoodItems.Category.STARTER;
                break;
            case 2:
                foodItems.category = FoodItems.Category.MAIN_COURSE;
                break;
            case 3:
                foodItems.category = FoodItems.Category.DESSERT;
                break;
            case 4:
                foodItems.category = FoodItems.Category.BEVERAGE;
                break;
            default:
                System.out.println("invalid choice");
        }
    }

    public void updatePreprationTime(FoodItems foodItems) {
        System.out.println("please Enter the new Preparation Time");
        Scanner sc = new Scanner(System.in);
        byte Ptime =  sc.nextByte();
        foodItems.preparationTime = Ptime;
    }

    public void updateName(FoodItems foodItems) {
        System.out.println("please Enter the new name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        foodItems.name = name;
    }
    public void addFoodItem(FoodItems foodItems) {
        System.out.println("Enter Food name");
        foodItems.name = sc.next();

//        System.out.println("Enter Food Type");
//        System.out.println("1.veg  2.non-veg");
//        int type = sc.nextInt();
//        if (type == 1) {
//            foodItems.type = FoodItems.Type.NON_VEG;
//        }
        System.out.println("Enter Food Category");
        System.out.println("1.Main Course  2.Starter  3.Dessert  4.Beverage");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItems.category = FoodItems.Category.MAIN_COURSE;
                break;
            case 2:
                foodItems.category = FoodItems.Category.STARTER;
                break;
            case 3:
                foodItems.category = FoodItems.Category.DESSERT;
                break;
            case 4:
                foodItems.category = FoodItems.Category.BEVERAGE;
                break;
            default:
                System.out.println("invalid option");
        }
        System.out.println("Enter Food Taste");
        System.out.println("press 1 for Spicy");
        System.out.println("press 2 for Sweet");
        System.out.println("press 3 for Spicy-Salty");
        int choice1 = sc.nextInt();
        switch (choice1){
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
                System.out.println("invalid option");
        }
        System.out.println("Enter Preparation Time");
        Scanner sc = new Scanner(System.in);
        byte Ptime =  sc.nextByte();
        foodItems.preparationTime =  Ptime;
    }
}

