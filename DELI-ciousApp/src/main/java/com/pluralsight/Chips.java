package com.pluralsight;

import static com.pluralsight.Main.scanner;
import static com.pluralsight.MenuItems.chips;

public class Chips extends OrderItem {

   private String type;
   private double price = 1.50;

    public Chips() {
    }

    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getChipsOptions() {
        return chips;
    }

    static void addChipsToOrder(Order order) {
        Chips chips = new Chips();

        System.out.println("What chips would you like to order? ");

//looping through the list of chips and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.chips.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.chips[i]);
        }
        //getting the user's selection
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());

        if (selection > 0 && selection <= MenuItems.chips.length) {
            chips.setType(MenuItems.chips[selection - 1]);
            order.addItemToOrder(chips);  // Adding the chips to the order
            System.out.println("You selected: " + chips.getType());
        } else {
            System.out.println("Invalid selection.");
        }
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public String toString() {
        return "Chips: \n" +
                "Chip type: " + type + "\n Chips Total: "
        + getCost();
    }
}
