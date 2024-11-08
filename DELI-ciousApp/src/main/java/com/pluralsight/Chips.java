package com.pluralsight;

public class Chips extends OrderItem {

    double chips;

    public Chips(double chips) {
        this.chips = 1.50;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
