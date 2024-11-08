package com.pluralsight;

public class Sandwich extends OrderItem {
    //list sandwich price based off size and bread type

    String breadType;
    String breadSize;
    boolean isToasted;



    @Override
    public double getCost() {
        return 0;
    }
}
