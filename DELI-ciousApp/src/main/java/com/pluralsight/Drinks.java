package com.pluralsight;

import static com.pluralsight.Main.scanner;

//This class represents a drink item in an order, it contains size, name and price properties
public class Drinks extends OrderItem {


    private double price; //price varies by size
    private String drinkSize; //sizes offered are small, medium and large
    private String drinkName; //i.e., Sprite, Pepsi, Coca-cola, etc...



    //default constructor
    public Drinks() {
    }

    //this method gets the drink size
    public String getDrinkSize() {
        return drinkSize;
    }

    //this method sets the drink size
    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    //this method gets the drink name
    public String getDrinkName(){
        return drinkName;
    }

    //this method sets the drink name
    public void setDrinkName(String drinkName){
        this.drinkName = drinkName;
    }

    //this method sets the price for the drink
    public void setPrice(double price){
        this.price = price;
    }

    /*
    * This static method prompts the user to make a selection, then adds the selected drink to the order
    * in the Order class.
    */
    static void addDrinkToOrder(Order order) {
        Drinks drink = new Drinks();
        double price = 0;

        System.out.println("What drink would you like to order? ");

    //looping through the list of drinks and displaying it to the customer so they can make a selection
        for (int i = 0; i < MenuItems.drinks.length; i++) {
            System.out.println(i + 1 + ") " + MenuItems.drinks[i]);
        }
        System.out.print("\nEnter selection: ");
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("---------------------------------------------");
        drink.setDrinkName(MenuItems.drinks[selection - 1]); //setting drink name based on selection

    //asking for drink size
        System.out.println("Select drink size: ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("\nSize selection: ");
        int size = Integer.parseInt(scanner.nextLine());

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

        //give confirmation to user
        System.out.println("\nYou selected a " + drink.getDrinkSize() + " " + drink.getDrinkName() + " for the price of $" + drink.getCost());
        System.out.println("-----------------------------------------------------------------");
    }

    @Override
    public double getCost() {
        return price;
    }



    @Override
    public String toString() {
        return "\nDrink: " + drinkName +
                "\nDrink Size: " + drinkSize +
                "\nPrice: $" + price;
    }
}
