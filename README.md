# DELI-ciousApp

## Description
The **DELI-cious app** is a sandwich shop application that allows the user to create customizable sandwiches by selecting their prefered toppings, meats, cheese and condiments. The price is calculated based on the sandwich size, selected ingredients and any extra add on. Users can also select different drink flavors, drink sizes and chips to add to their order. This app also generates individual receipt files for each order.

## Screenshots
Here are some screenshots of the app:

![Home Screen / New Order Screen](https://github.com/user-attachments/assets/1ed86013-bbb4-4149-8506-f78984190110)

![Sandwich Selection Screen](https://github.com/user-attachments/assets/119ed3ce-4646-49e2-9060-dd02605148d2)

![Drink Selection](https://github.com/user-attachments/assets/050bfb9f-9071-43e9-9284-c0ebed48d0fa)

![Chip Selection](https://github.com/user-attachments/assets/1864dcec-2c09-4f81-bd15-71cc84372d02)

![Order Details](https://github.com/user-attachments/assets/3f43532d-2a1f-4b2e-adcf-4f47d847afe1)

## Interesting Code Example
One interesting part of the project is the `toString()` method that helps compile the order details and presents them in a user-friendly way. This method iterates through the order items and constructs a summary of the order, including each item's details and the total cost of the order. Here's the code:

```java
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

