package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

//this class represents a customers order, it contains multiple order items and a total.
public class Order {

    private double orderTotal; //the total cost of all order items

    private List<OrderItem> items; //this will store all order items in a list


    //this constructor holds the items being put in the order.
    public Order(){
        this.items = new ArrayList<>();
    }

    //this method adds an item to the order
    public void addItemToOrder(OrderItem item){
        items.add(item);
    }

    // method to calculate the total of all items in the order
    private double calculateOrderTotal(){
         orderTotal = 0;
        for(OrderItem item : items){
            orderTotal += item.getCost(); //adding the cost of each item in the order
        }
        return  orderTotal;
    }

    /*this method returns a formatted string of the entire order, including details of the items in the order
    and the total cost of the order.
    */
    @Override
    public String toString() {
        //helps put the order details together in one place
        StringBuilder orderDetails = new StringBuilder("Order Details: \n");

        //adding the item's details to the order summary one by one
        for (OrderItem item : items){
            orderDetails.append(item.toString()).append("\n");
        }

        //adding the total cost of the order to the summary
        orderDetails.append("\nOrder Total: $" + calculateOrderTotal() + "\n");

        //returning a converted StringBuilder into a single string
        return orderDetails.toString();
    }
}