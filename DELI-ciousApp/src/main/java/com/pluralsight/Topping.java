package com.pluralsight;

import java.util.Scanner;

public class Topping extends OrderItem {
    static Scanner scanner = new Scanner(System.in);

    //Method displaying regular toppings and add them to the sandwich
    static void displayRegularToppings(Sandwich sandwich) {
        while (true) {
            System.out.println("Please select your toppings: ");
            System.out.println("(If you'd like multiple, please separate by commas)");

            //listing all the toppings options
            for (int i = 0; i < MenuItems.regToppings.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.regToppings[i]);
            }
            System.out.print("\nEnter Selection: ");
            String[] selection = scanner.nextLine().split(",");

            for (String selectionInt : selection) {

                //adding selection to sandwich instance
                if (Integer.parseInt(selectionInt) >= 0 && Integer.parseInt(selectionInt) <= MenuItems.regToppings.length) {
                    String toppingSelection = MenuItems.regToppings[Integer.parseInt(selectionInt) - 1]; //getting selected topping
                    sandwich.addTopping(toppingSelection);
                    System.out.println("You selected: " + toppingSelection);

                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            }
            break;
        }
        displayMeats(sandwich);
    }

    //method displaying available meats to add to sandwich
    static void displayMeats(Sandwich sandwich) {
        while (true){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Please make a selection: ");

            //looping through the list of meats and displaying it to the customer so they can make a selection
            for (int i = 0; i < MenuItems.meats.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.meats[i]);
            }
            System.out.print("\nEnter Selection: ");
            int selection = Integer.parseInt(scanner.nextLine());

            //adding selected meat to sandwich
            if (selection > 0 && selection <= MenuItems.meats.length) {
                String selectedMeat = MenuItems.meats[selection - 1]; // Get the selected meat
                sandwich.addMeat(selectedMeat);
                System.out.println("You selected: " + selectedMeat);
                System.out.println("-------------------------------------------------------------------");
            } else {
                System.out.println("Invalid selection. Please try again.");
            }

            //asking user if they'd like extra meat for an additional cost
            System.out.print("Would you like to add extra meat for an additional cost? (Y or N)?: ");
            String choice = scanner.nextLine();
            System.out.println("-------------------------------------------------------------------");
            if (choice.equalsIgnoreCase("Y")) {
                sandwich.addExtraMeat(); //applying extra charge by calling this method
            }
            displayCheeses(sandwich);
            break;
        }
    }

    //Method displaying cheeses available to add to sandwich
    static void displayCheeses(Sandwich sandwich) {
        while (true) {
            System.out.println("Please select your cheese: ");

            //looping through the list of cheeses and displaying it to the customer so they can make a selection
            for (int i = 0; i < MenuItems.cheeses.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.cheeses[i]);
            }
            System.out.print("\nEnter Selection: ");
            int selection = Integer.parseInt(scanner.nextLine());


            //adding selected cheese to sandwich
            if (selection > 0 && selection <= MenuItems.cheeses.length) {
                String selectedCheese = MenuItems.cheeses[selection - 1]; // Get the selected cheese
                sandwich.addCheese(selectedCheese);
                System.out.println("You selected: " + selectedCheese);
                System.out.println("-------------------------------------------------------------------");
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
            //asking user if they'd like extra meat for an additional cost
            System.out.print("Would you like to add extra cheese for an additional cost? (Y or N)?: ");
            String choice = scanner.nextLine();
            System.out.println("-------------------------------------------------------------------");

            if (choice.equalsIgnoreCase("Y")) {
                sandwich.addExtraCheese(); //applying extra charge by calling this method
            }
            displaySauces(sandwich);
            break;
        }
    }

    static void displaySauces(Sandwich sandwich) {
        while (true){
            System.out.println("Please select your condiments");
            System.out.println("(If you'd like multiple, please separate by commas)");

            //looping through the list of sauces available
            for (int i = 0; i < MenuItems.sauces.length; i++) {
                System.out.println(i + 1 + ") " + MenuItems.sauces[i]);
            }
            System.out.print("\nEnter Selection: ");
            String[] selection = scanner.nextLine().split(",");

            for (String selectionInt : selection) {

                //adding selection to sandwich instance
                if (Integer.parseInt(selectionInt) >= 0 && Integer.parseInt(selectionInt) <= MenuItems.sauces.length) {
                    String sauceSelection = MenuItems.sauces[Integer.parseInt(selectionInt) - 1]; //getting selected topping
                    sandwich.addTopping(sauceSelection);
                    System.out.println("You selected: " + sauceSelection);
                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            }
            //calculating total of all selections
            double totalCost = sandwich.getCost();
            System.out.println("\nYour sandwich total is: " + totalCost);
            System.out.println("-------------------------------------------------------------------");
            break;
        }
    }

    @Override
    public String toString() {
        return "Toppings: \n";
    }

    @Override
    public double getCost() {
        return 0;
    }
}

