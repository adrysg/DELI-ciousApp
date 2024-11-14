package com.pluralsight;

import static com.pluralsight.Main.scanner;

//The chips class represents a chip item in an order, there's a type and a fixed price.

public class Chips extends OrderItem {

   private String type; //type of chips (i.e., Doritos, Lays, etc..)

   private double price = 1.50; //set price for any type of chips


    public Chips() {
    }

    //This constructor sets the chips type
    public Chips(String type) {
        this.type = type;
    }

    //this method gets the type of chips
    public String getType() {
        return type;
    }

    //this method sets the type of chips
    public void setType(String type) {
        this.type = type;
    }

    /*
    this static method prompts the user to select a type of chips and adds it to the order
    in the order class
    */
    static void addChipsToOrder(Order order) {
        Chips chips = new Chips();

        System.out.println("What chips would you like to order? ");

    //looping through the list of chips and displaying it to user
        for (int i = 0; i < MenuItems.chips.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.chips[i]);
        }
        //getting the user's selection
        System.out.print("\nEnter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());

        //checking for the user's selection
        if (selection > 0 && selection <= MenuItems.chips.length) {
            chips.setType(MenuItems.chips[selection - 1]);
            order.addItemToOrder(chips);  // Adding the chips to the order
            System.out.println("\nYou selected: " + chips.getType() + " for the price of $" + chips.price);
            System.out.println("-------------------------------------------------------------------");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    //this method returns the fixed chips price of $1.50
    @Override
    public double getCost() {
        return price;
    }

    //returns a string of the chips object including the type and price.
    @Override
    public String toString() {
        return "\nChips: " +
                "\nChip type: " + type +
                "\nPrice: $" + getCost();
    }
}
