package com.pluralsight;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

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
                    Order.orderScreen();
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
                    Sandwich.addSandwichToOrder();
                    break;
                case 2:
                    Drinks.addDrinkToOrder();
                    break;
                case 3:
                    Chips.addChipsToOrder();
                    break;
                case 4:
                    displayCheckout();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Sorry Invalid Option");
            }

        } while (selection != 0);

    }

    static void displayCheckout() {
        System.out.println("\n Checkout: \n");

        System.out.println("--------------------");
        System.out.println("1) Confirm");
        System.out.println("1) Cancel");
        String answer = scanner.nextLine();
        System.out.println(answer);
        System.out.println("Thank you for preferring us! ");
    }

}

