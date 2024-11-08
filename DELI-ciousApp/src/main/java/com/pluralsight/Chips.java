package com.pluralsight;

public class Chips extends OrderItem {

   private String type;
   private double chips;

    public Chips() {
    }

    public Chips(double chips, String type) {
        this.type = type;
        this.chips = 1.50;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getChips() {
        return chips;
    }

    public void setChips(double chips) {
        this.chips = chips;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "type='" + type + '\'' +
                ", chips=" + chips +
                '}';
    }
}
