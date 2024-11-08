package com.pluralsight;

public class Topping extends OrderItem {

    //list all toppings based off sandwich size and price
    private String toppingName;
    private boolean hasMeat;
    private boolean hasExtraMeat;
    private boolean hasCheese;
    private boolean hasExtraCheese;

    public Topping(String toppingName, boolean hasMeat, boolean hasExtraMeat, boolean hasCheese, boolean hasExtraCheese) {
        this.toppingName = toppingName;
        this.hasMeat = hasMeat;
        this.hasExtraMeat = hasExtraMeat;
        this.hasCheese = hasCheese;
        this.hasExtraCheese = hasExtraCheese;
    }


    @Override
    public double getCost() {
        return 0;
    }
}
