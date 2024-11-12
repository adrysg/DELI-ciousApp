package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.Main.scanner;

public class Sandwich extends OrderItem {
    //list sandwich price based off size and bread type

    private String breadType;
    private static String breadSize;
    private boolean isToasted;
    private ArrayList<String> toppings;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;


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

    public static void setBreadType(String breadType) {
        breadType = breadType;
    }

    public static String getBreadSize() {
        return breadSize;
    }

    public static void setBreadSize(String breadSize) {
        breadSize = breadSize;
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

    public static void setMeats(ArrayList<String> meats) {
        meats = meats;
    }

    public void addMeat(String meat){
        this.meats.add(meat);
    }

    public ArrayList<String> getCheeses() {
        return cheeses;
    }

    public static void setCheeses(ArrayList<String> cheeses) {
        cheeses = cheeses;
    }

    public static void addSandwichToOrder() {
        double price = 0;

        System.out.println("What size would you like your sandwich?");
        System.out.println("1) 4in");
        System.out.println("2) 8in");
        System.out.println("3) 12in");
        System.out.print("Enter Selection: ");
        //use scanner to get user input
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------");

        // add switch statement
        switch (selection) {
            case 1:
                Sandwich.setBreadSize("4");
                break;
            case 2:
                Sandwich.setBreadSize("8");
                break;
            case 3:
                Sandwich.setBreadSize("12");
                break;
            default:
                System.out.println("Sorry invalid - Defaulting to an 8in. ");
                break;
        }

        if (Sandwich.getBreadSize() == "4") {
            price = 5.50;
        }
        else if (Sandwich.getBreadSize() == "8") {
            price = 7.00;
        }
        else if (Sandwich.getBreadSize() == "12") {
            price = 8.50;
        }
//                System.out.println(selection + price);

        System.out.println("What kind of bread would you like?");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter selection: ");
        selection = Integer.parseInt(scanner.nextLine());
        System.out.println("--------------------");
        switch (selection) {
            case 1:
                Sandwich.setBreadType("White");
                break;
            case 2:
                Sandwich.setBreadType("Wheat");
                break;
            case 3:
                Sandwich.setBreadType("Rye");
                break;
            case 4:
                Sandwich.setBreadType("Wrap");
                break;
        }
//have user select toppings
        do {
            System.out.println("What toppings would you like?");
            System.out.println("Note: Meats and Cheeses are considered premium toppings");
            System.out.println("1) Regular");
            System.out.println("2) Meats");
            System.out.println("3) Cheese");
            System.out.print("Enter Selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("--------------------");

            switch (selection) {
                case 1:
                    Topping.displayRegularToppings();
                    break;
                case 2:
                    Topping.displayMeats();
                    break;
                case 3:
                    Topping.displayCheeses();
                    break;
                default:
                    System.out.println("Sorry invalid input. ");
                    break;
            }

        } while (false);

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

