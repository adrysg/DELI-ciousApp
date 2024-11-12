package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Topping extends OrderItem {
    static Scanner scanner = new Scanner(System.in);

    static void displayRegularToppings() {
        System.out.println("Please select your options: ");
        for (int i = 0; i < MenuItems.RegToppings.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.RegToppings[i]);
        }
        System.out.print("Selection: ");
        int selection = Integer.parseInt(scanner.nextLine());

    }

    static void displayMeats() {;
        do {
            System.out.println("Please select your options: ");

//looping through the list of meats and displaying it to the customer so they can make a selection
            for (int i = 0; i < MenuItems.meats.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.meats[i]);
            }
            System.out.print("Selection: ");
            int selection = Integer.parseInt(scanner.nextLine());
            System.out.println("----------------");
            System.out.print("Would you like to add more (Y or N)?: ");
            String choice = scanner.nextLine();
            System.out.println("-------------------------------------");
            if(choice.equalsIgnoreCase("Y")){
                displayMeats();
            } else if (choice.equalsIgnoreCase("N")){
                displayCheeses();
            }
            Sandwich.setMeats(new ArrayList<>(selection));

        } while (false);
    }

    static void displayCheeses() {
        do {
            System.out.println("Please select your options: ");
//looping through the list of drinks and displaying it to the customer so they can make a selection
            for (int i = 0; i < MenuItems.cheeses.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.cheeses[i]);
            }
            System.out.print("Selection: ");
            int selection = Integer.parseInt(scanner.nextLine());
            System.out.println("----------------");
            System.out.print("Would you like to add more (Y or N)?: ");
            String choice = scanner.nextLine();
            System.out.println("-------------------------------------");
            if(choice.equalsIgnoreCase("Y")){
                displayCheeses();
            } else if (choice.equalsIgnoreCase("N")){
                displaySauces();
            }
            Sandwich.setCheeses(new ArrayList<>(selection));

        } while (false);

    }

    static void displaySauces(){
        System.out.println("Please make a selection from the options below");
        for (int i = 0; i < MenuItems.sauces.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.sauces[i]);
        }
        System.out.print("Selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------");
        System.out.print("Would you like to add more (Y or N)?: ");
        String choice = scanner.nextLine();
        System.out.println("-------------------------------------");
        if(choice.equalsIgnoreCase("Y")){
            displaySauces();
        } else if (choice.equalsIgnoreCase("N")){
            Order.displayCheckout();
        }
    }

    @Override
    public double getCost() {
        return 0;
    }
}
