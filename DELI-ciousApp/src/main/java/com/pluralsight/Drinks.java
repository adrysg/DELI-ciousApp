package com.pluralsight;

import static com.pluralsight.Main.scanner;

public class Drinks extends OrderItem {

    private double price;
    private String drinkSize;
    private String drinkName;

    public Drinks(String drinkSize, String drinkName) {
        this.drinkSize = drinkSize;
        this.drinkName = drinkName;
    }

    public Drinks() {
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public void setDrinkName(String drinkName){
        this.drinkName = drinkName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    static void addDrinkToOrder(Order order) {
        Drinks drink = new Drinks();
        double price = 0;

        System.out.println("What drink would you like to order? ");

//looping through the list of drinks and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.drinks.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.drinks[i]);
        }
        System.out.print("Enter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
        drink.setDrinkName(MenuItems.drinks[selection - 1]); //setting drink name based on selection

    //asking for drink size
        System.out.println("Select drink size: ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Size selection: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("--------------------------");

        // set drink size based on selection
        switch (size) {
            case 1:
                drink.setDrinkSize("Small");
                price = 2.00;
                break;
            case 2:
                drink.setDrinkSize("Medium");
                price = 2.50;
                break;
            case 3:
                drink.setDrinkSize("Large");
                price = 3.00;
                break;
        }

        // set the price for the drink
        drink.setPrice(price);

        // add the drink to the order
        order.addItemToOrder(drink);

        System.out.println("You selected a: " + drink.getDrinkSize() + " " + drink.getDrinkName());

    }

    @Override
    public double getCost() {
        return price;
    }



    @Override
    public String toString() {
        return "Drink: " + drinkName + "\n" +
                "Drink Size: " + drinkSize + "\n" +
                "Price: $" + price + "\n";
    }
}
