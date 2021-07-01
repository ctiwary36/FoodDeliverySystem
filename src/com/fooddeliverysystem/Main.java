package com.fooddeliverysystem;

public class Main {
    public static void main(String[] args) {
        GobiManchuriyan gobiManchuriyan = new GobiManchuriyan();
        gobiManchuriyan.price = 200;
        PaneerMasala paneerMasala = new PaneerMasala();
        paneerMasala.price = 150;
        Biryani biryani = new Biryani();
        biryani.price = 250;
        Sweets sweets = new Sweets();
        sweets.price = 50;
        LemonJuice lemonJuice = new LemonJuice();
        lemonJuice.price = 80;

        FoodManager foodManager = new FoodManager();
        foodManager.add(biryani);
        foodManager.add(gobiManchuriyan);
        foodManager.add(lemonJuice);
        foodManager.add(sweets);
        foodManager.add(paneerMasala);

        foodManager.printFood();

    }
}
