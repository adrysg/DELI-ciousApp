package com.pluralsight;

import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);


    //This main class serves as my user interface.

    public static void main(String[] args) {

        homeScreen();
    }

    public static void homeScreen() {
        int selection;
        do {
            System.out.println("\n Welcome to DELI-cious Sandwich, how can we help you?");
            System.out.println("-------------------------------------------------------");
            System.out.println("1) New Order ");
            System.out.println("0) Exit ");
            System.out.print("Enter selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("----------------------");

            switch (selection) {
                case 1: orderScreen();
                case 0: {
                    System.out.println("Have a nice day!");
                    return;
                }
            }
        } while (true);
    }

    private static void orderScreen() {
        int selection;
        do {
            System.out.println("What would you like to order?");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------");

            switch (selection) {
                case 1:
                    addSandwichToOrder();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Sorry Invalid Option");
            }

        } while (selection != 0);

    }

    private static void addSandwichToOrder(){
        Sandwich sandwich = new Sandwich();

        System.out.println("What size would you like your sandwich?");
        System.out.println("1) 4in");
        System.out.println("2) 8in");
        System.out.println("3) 12in");
        System.out.print("Enter Selection: ");
        //use scanner to get user input
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------");

        // add switch statement
        switch (selection){
            case 1:
                sandwich.setBreadSize("4");
                break;
            case 2:
                sandwich.setBreadSize("8");
                break;
            case 3:
                sandwich.setBreadSize("12");
                break;
            default:
                System.out.println("Sorry invalid - Defaulting to an 8in. ");
                break;
        }
//have user select toppings
        System.out.println("What toppings would you like?");
        System.out.println("Note: Meats and Cheeses are considered premium toppings");
        System.out.println("1) Regular");
        System.out.println("2) Meats");
        System.out.println("3) Cheese");
        System.out.print("Enter Selection: ");
        selection = Integer.parseInt(scanner.nextLine());
        System.out.println("--------------------");

        switch (selection){
            case 1:
                displayRegularToppings();
                break;
            case 2:
                displayMeats();
                break;
            case 3:
                displayCheeses();
                break;
            default:
                System.out.println("Sorry invalid input. ");
                break;
        }


    }

    private static void displayRegularToppings(){

        for(int i = 0; i < MenuItems.RegToppings.length;i++){
            System.out.println(i+1 + ") "+ MenuItems.RegToppings[i]);
        }
    }

    private static void displayMeats(){

        for(int i = 0; i < MenuItems.meats.length;i++){
            System.out.println(i+1 + ") "+ MenuItems.meats[i]);
        }
    }

    private static void displayCheeses(){

        for(int i = 0; i < MenuItems.cheeses.length;i++){
            System.out.println(i+1 + ") "+ MenuItems.cheeses[i]);
        }
    }

    private static void displayChips(){

    }

    private static void displayDrinks(){

    }

    private static void addDrinkToOrder(){

    }

    private static void addChipsToOrder(){

    }

    private static void Checkout(){

    }


}