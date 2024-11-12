package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    static Scanner scanner = new Scanner(System.in);

    private String sandwiches;
    private String chips;
    private String drinks;


    public Order(String sandwiches, String chips, String drinks) {
        this.sandwiches = sandwiches;
        this.chips = chips;
        this.drinks = drinks;
    }

    public String getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(String sandwiches) {
        this.sandwiches = sandwiches;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Order\n" +
                "Sandwiches: " + sandwiches +
                "Chips: " + chips +
                "Drinks: " + drinks;
    }

    static void orderScreen() {
        int selection;
        do {
            System.out.println("What would you like to order?");
            System.out.println("1) Sandwich");
            System.out.println("2) Drink");
            System.out.println("3) Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------");

            switch (selection) {
                case 1:
                    addSandwichToOrder();
                    break;
                case 2:
                    addDrinkToOrder();
                    break;
                case 3:
                    addChipsToOrder();
                    break;
                case 4:
                    displayCheckout();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Sorry Invalid Option");
            }

        } while (selection != 0);

    }

    private static void addSandwichToOrder() {
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
        switch (selection) {
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

        System.out.println("What kind of bread would you like?");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter selection: ");
        selection = Integer.parseInt(scanner.nextLine());
        System.out.println("--------------------");
        switch (selection) {
            case 1:
                sandwich.setBreadType("White");
                break;
            case 2:
                sandwich.setBreadType("Wheat");
                break;
            case 3:
                sandwich.setBreadType("Rye");
                break;
            case 4:
                sandwich.setBreadType("Wrap");
                break;
        }
//have user select toppings
        do {
            System.out.println("What toppings would you like?");
            System.out.println("Note: Meats and Cheeses are considered premium toppings");
            System.out.println("1) Regular");
            System.out.println("2) Meats");
            System.out.println("3) Cheese");
            System.out.print("Enter Selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("--------------------");

            switch (selection) {
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

        } while (false);

    }
    private static void displayRegularToppings() {
        System.out.println("Please select your options: ");
        for (int i = 0; i < MenuItems.RegToppings.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.RegToppings[i]);
        }
        System.out.print("Selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
    }

    private static void displayMeats() {
        Sandwich sandwich = new Sandwich();
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
                break;
            }
            sandwich.setMeats(new ArrayList<>(selection));

        } while (false);
    }

    private static void displayCheeses() {
        Sandwich sandwich = new Sandwich();
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
                break;
            }
            sandwich.setCheeses(new ArrayList<>(selection));

        } while (false);

    }

    private static void addDrinkToOrder() {
        Drinks drink = new Drinks();
        double price = 0;

        System.out.println("What drink would you like to order? ");
//looping through the list of drinks and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.drinks.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.drinks[i]);
        }
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("Select drink size: ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Size selection: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("--------------------------");
        switch (size) {
            case 1:
                drink.setDrinkSize("Small");
                break;
            case 2:
                drink.setDrinkSize("Medium");
                break;
            case 3:
                drink.setDrinkSize("Large");
                break;
        }
        if (drink.getDrinkSize().equalsIgnoreCase("Small")) {
            price = 2.00;
        } else if (drink.getDrinkSize().equalsIgnoreCase("Medium")) {
            price = 2.50;
        } else if (drink.getDrinkSize().equalsIgnoreCase("Large")) {
            price = 3.00;
        }
        System.out.println(selection + size + price);

    }

    private static void addChipsToOrder() {
        System.out.println("What chips would you like to order? ");
//looping through the list of chips and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.chips.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.chips[i]);
        }
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
        if (selection == 1) {


        }
    }

    private static void displayCheckout() {
        System.out.println("\n Checkout: \n");
        System.out.println("--------------------");
        System.out.println("1) Confirm");
        System.out.println("1) Cancel");
        String answer = scanner.nextLine();
        System.out.println(answer);
        System.out.println("Thank you for preferring us! ");
    }


}
