package com.pluralsight;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Order order = new Order();

    //This main class serves as my user interface.

    public static void main(String[] args) {

        homeScreen();
        orderScreen();

    }

    public static void homeScreen() {
        int selection;
        do {
            System.out.println("\n Welcome to DELI-cious Sandwich, how can we help you?");
            System.out.println("-------------------------------------------------------");
            System.out.println("1) New Order ");
            System.out.println("0) Exit ");
            System.out.print("Enter selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("----------------------");

            switch (selection) {
                case 1:
                    orderScreen(); //go to order screen
                case 0: {
                    System.out.println("Have a nice day!");
                    return;
                }
            }
        } while (true);
    }

    static void orderScreen() {
        int selection;
        do {
            System.out.println("What would you like to order?");
            System.out.println("1) Sandwich");
            System.out.println("2) Drink");
            System.out.println("3) Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------");

            switch (selection) {
                case 1:
                    Sandwich.addSandwichToOrder(order);
                    break;
                case 2:
                    Drinks.addDrinkToOrder(order);
                    break;
                case 3:
                    Chips.addChipsToOrder(order);
                    break;
                case 4:
                    displayCheckout();
                    break;
                case 0:
                    System.out.println("Your order has been cancelled.");
                    break;
                default:
                    System.out.println("Sorry, invalid option");
            }

        } while (selection != 0 && selection != 4); //exit loop when customer cancels or wants to check out

    }

    static void displayCheckout() {
        System.out.println("\n Checkout: ");
        System.out.println("--------------------");


        //displaying order details and total
        System.out.println(order.toString());

        System.out.println("--------------------");
        System.out.println("1) Confirm");
        System.out.println("2) Cancel");
        System.out.print("Enter selection: ");
        String answer = scanner.nextLine();

        if(answer.equals("1")) {
            //saving order receipt
            try {
                new ReceiptFileManager(order); //saving order as a receipt
                System.out.println("Thank you for preferring us!");
            } catch (Exception e) {
                System.out.println("There was an error saving your receipt.");
            }
        } else if (answer.equals("2")){
                System.out.println("Your order has been cancelled.");
            }

    }

}

