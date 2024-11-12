package com.pluralsight;

import static com.pluralsight.Main.scanner;

public class Drinks extends OrderItem {

    String drinkType;
    String drinkSize;

    public Drinks(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public Drinks() {

    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }


    static void addDrinkToOrder() {
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

        // set drink size based on input
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


    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "Drinks:\n" +
                "Drink Size: " + drinkSize;
    }
}
