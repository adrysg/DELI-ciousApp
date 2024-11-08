package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sandwich extends OrderItem {
    //list sandwich price based off size and bread type

    private String breadType;
    private String breadSize;
    private boolean isToasted;
    private ArrayList<String> toppings;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;

    public Sandwich() {
    }

    public Sandwich(String breadType, String breadSize, boolean isToasted, ArrayList<String> toppings, ArrayList<String> meats, ArrayList<String> cheeses) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.isToasted = isToasted;
        this.toppings = toppings;
        this.meats = meats;
        this.cheeses = cheeses;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<String> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<String> meats) {
        this.meats = meats;
    }

    public void addMeat(String meat){
        this.meats.add(meat);
    }

    public ArrayList<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(ArrayList<String> cheeses) {
        this.cheeses = cheeses;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", breadSize='" + breadSize + '\'' +
                ", isToasted=" + isToasted +
                ", toppings=" + toppings +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                '}';
    }

    @Override
    public double getCost() {



        return 0;
    }
}

