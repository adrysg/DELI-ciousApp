package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private double orderTotal;
    private List<OrderItem> items; //this will store all order items in a list

    //creating a sandwich constructor

    public Order(){
        this.items = new ArrayList<>();
    }

    public void addItemToOrder(OrderItem item){
        items.add(item);
    }

    // method to calculate the total of all order items
    private double calculateOrderTotal(){
        double total = 0;
        for(OrderItem item : items){
            total += item.getCost(); //adding the cost of each item in the order
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order Details: \n");

        for (OrderItem item : items){
            orderDetails.append(item.toString()).append("\n");
        }

        orderDetails.append("Order Total: $" + orderTotal + "\n");

        return orderDetails.toString();
    }
}