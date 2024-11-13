package com.pluralsight;

import static com.pluralsight.Main.scanner;
import static com.pluralsight.MenuItems.chips;

public class Chips extends OrderItem {

   private String type;

    public Chips() {
    }

    public Chips(double chips, String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getChips(int selection) {
        return chips;
    }


    static void addChipsToOrder(Order order) {
        System.out.println("What chips would you like to order? ");
//looping through the list of chips and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.chips.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.chips[i]);
        }
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());



    }

    @Override
    public double getCost() {
        return 1.50;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "type='" + type + '\'' +
                ", chips=" + chips +
                '}';
    }
}
