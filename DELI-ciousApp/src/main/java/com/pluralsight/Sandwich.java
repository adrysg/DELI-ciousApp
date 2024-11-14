package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.Main.scanner;

public class Sandwich extends OrderItem {
   //represents a sandwich being created by the user, containing parts of a sandwich like bread type, size and toppings

    private static String breadType; //i.e., white, wheat, wrap, etc.

    private static String breadSize; //available in 4in, 8in, and 12in

    private boolean isToasted; //whether the user wants a toasted sandwich or not

    private ArrayList<String> toppings; //list of reg toppings

    private ArrayList<String> meats; //list of meats added to sandwich

    private ArrayList<String> cheeses; //list of cheeses

    private ArrayList<String> sauces; //list of sauces

    private double basePrice; //base price of sandwich based on size

   //
   public Sandwich(String breadSize){
       this.breadSize = breadSize;
       this.toppings = new ArrayList<>();
       this.meats = new ArrayList<>();
       this.cheeses = new ArrayList<>();
       this.sauces = new ArrayList<>();
       setBasePrice(breadSize);
   }

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
        setBasePrice(breadSize);
    }

    public void setBreadType(String breadType) {
        Sandwich.breadType = breadType;
    }

    //setting base price based on sandwich size
   private void setBasePrice(String breadSize){
       switch (breadSize){
           case "4":
               basePrice = 5.50;
               break;
           case "8":
               basePrice = 7.00;
               break;
           case "12":
               basePrice = 8.50;
               break;

       }
   }

    public double getBasePrice() {
        return basePrice;
    }

    //calculating cost of extra meat based on size
    public void addExtraMeat(){
       double extraCost = 0;
       if(breadSize.equals("4")){
           extraCost = .50;
       }
       else if (breadSize.equals("8")){
           extraCost = 1.00;
       }
       else if (breadSize.equals("12")){
           extraCost = 1.50;
       }
       //adding extra cost to base price
       basePrice += extraCost;
    }

    //calculating cost of extra cheese based on size
    public void addExtraCheese(){
        double extraCost = 0;
        if(breadSize.equals("4")){
            extraCost = .30;
        }
        else if (breadSize.equals("8")){
            extraCost = .60;
        }
        else if (breadSize.equals("12")){
            extraCost = .90;
        }
        //adding extra cost to base price
        basePrice += extraCost;
    }

   public void addTopping(String topping){
       toppings.add(topping);
   }

   public void addMeat(String meat){
       meats.add(meat);
   }

   public void addCheese(String cheese){
       cheeses.add(cheese);
   }


    public static void addSandwichToOrder(Order order) {

        System.out.println("What size would you like your sandwich?");
        System.out.println("1) 4in");
        System.out.println("2) 8in");
        System.out.println("3) 12in");
        System.out.print("\nEnter Selection: ");

        //use scanner to get user input
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------------------------------------");

        // add switch statement for bread size selection
        switch (selection) {
            case 1:
                breadSize = "4";
                break;
            case 2:
                breadSize = "8";
                break;
            case 3:
                breadSize = "12";
                break;
            default:
                System.out.println("Sorry invalid - Defaulting to an 8in. ");
        }
        Sandwich sandwich = new Sandwich(breadSize); //created a sandwich object

        //prompt for bread type
        System.out.println("What kind of bread would you like?");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("\nEnter selection: ");
        selection = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------------------------------------");
        switch (selection) {
            case 1:
                breadType = "White";
                break;
            case 2:
                breadType = "Wheat";
                break;
            case 3:
                breadType = "Rye";
                break;
            case 4:
                breadType = "Wrap";
                break;
        }
        order.addItemToOrder(sandwich);

        System.out.print("Would you like your sandwich toasted? (Y or N): ");
        String answer = scanner.nextLine();
        System.out.println("-------------------------------------------------------------------");
        if(answer.equalsIgnoreCase("Y")){
            sandwich.isToasted = true;
        }
        else if (answer.equalsIgnoreCase("N")){
            sandwich.isToasted = false;
        }

        //have user select toppings, meats and cheese
        boolean isAdding = true;
        while (isAdding) {
            System.out.println("Please select your toppings \n");
            System.out.println("Note: You will select toppings in the same order below,\n" +
                    "Meats and cheese are considered premium.");
            System.out.println("1) Regular");
            System.out.println("2) Meats");
            System.out.println("3) Cheese");
            System.out.print("\nEnter Selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("-------------------------------------------------------------------");

            switch (selection) {
                case 1:
                    Topping.displayRegularToppings(sandwich);
                    break;
                case 2:
                    Topping.displayMeats(sandwich);
                    break;
                case 3:
                    Topping.displayCheeses(sandwich);
                    break;
                default:
                    System.out.println("Sorry invalid input. ");
                    break;
            }

            isAdding = false;

        }

    }

    //returns a formatted string of the sandwich, including the details
    @Override
    public String toString() {
        return "\nSandwich: " +
                "\nBread type: " + breadType +
                "\nBread size: " + breadSize +
                "\nToasted: " + isToasted +
                "\nToppings: " + toppings +
                "\nMeats: " + meats +
                "\nCheese: " + cheeses

                +
                "\nSandwich Total: " + getCost();

    }

    //calculates and returns total price of sandwich based on user selections
    @Override
    public double getCost() {
        double totalPrice = basePrice;

        //Adding cost of meats and cheese based on sandwich size to base price
        if (breadSize.equals("4")) {
            totalPrice += 1.00; //cost of meat for this size
            totalPrice += 0.75; //cost of cheese for this size
        }
        else if (breadSize.equals("8")) {
            totalPrice += 2.00; //cost of meat for this size
            totalPrice += 1.50; //cost of cheese for this size
        }
        else if (breadSize.equals("12")) {
            totalPrice += 3.00; //cost of meat for this size
            totalPrice += 2.25; //cost of cheese for this size
        }
        return totalPrice;
    }

}

