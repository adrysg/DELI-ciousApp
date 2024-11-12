package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    //This main class serves as my user interface.

    public static void main(String[] args) {

        homeScreen();
        Order.orderScreen();
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

}

