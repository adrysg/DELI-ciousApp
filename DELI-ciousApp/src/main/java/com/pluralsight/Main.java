package com.pluralsight;

import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);

    //This main class serves as my user interface.

    public static void main(String[] args) {

        homeScreen();
    }

    public static void homeScreen() {
        int selection;
        do {
            System.out.println("\n Welcome to DELI-cious Sandwich, how can we help you?");
            System.out.println("-------------------------------------------------------");
            System.out.println("1) New Order ");
            System.out.println("0) Exit ");
            System.out.print("Enter selection: ");
            selection = scanner.nextInt();
            System.out.println("----------------------");

            switch (selection) {
                case 1 -> orderScreen();
                case 0 -> {
                    System.out.println("Have a nice day!");
                    return;
                }
            }
        } while (selection == 1);
    }

    private static void orderScreen() {
        System.out.println("What would you like to order?");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("Enter selection: ");
        int selection = scanner.nextInt();
        System.out.println("---------------------");


    }
}