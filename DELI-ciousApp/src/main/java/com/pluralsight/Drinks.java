package com.pluralsight;

public class Drinks extends OrderItem {

     String drinkSize;

    public Drinks(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public Drinks() {

    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
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
