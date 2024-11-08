package com.pluralsight;

public class Drinks extends OrderItem {

     double drinkSize;

    public Drinks(double drinkSize) {
        this.drinkSize = drinkSize;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkSize=" + drinkSize +
                '}';
    }
}
