package com.pluralsight;

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


}
