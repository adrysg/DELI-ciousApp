package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items;
    private double orderTotal;

    public void Order(){
        items = new ArrayList<>();
        orderTotal = getOrderTotal();
    }

    public void addItemToOrder(OrderItem item){
        items.add(item);
        orderTotal += item.getCost();
    }

    public double getOrderTotal() {
        double orderTotal = 0;
        for (OrderItem item : items){
            orderTotal += item.getCost();
        }
        return orderTotal;
    }

    @Override
    public String toString() {
        return "Order\n" +
                "items: " + items +
                "Order total: " + orderTotal;
    }
}
