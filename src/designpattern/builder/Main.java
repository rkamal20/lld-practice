package src.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Food Delivery System

        Order order1 = new Order.Builder()
                .customer("Alice")
                .items(new ArrayList<>(List.of("Burger", "Coke")))
                .restaurant("Paradise")
                .build();

        System.out.println(order1);

        Order order2 = new Order.Builder()
                .customer("Alice")
                .items(List.of("Burger", "Coke"))
                .restaurant("Paradise")
                .deliveryAddress("Bangalore")
                .deliveryInstructions("Leave at the door")
                .deliveryBoy("Rahul")
                .build();

        System.out.println(order2);

        Order order3 = new Order.Builder()
                .items(List.of("Burger", "Coke"))
                .restaurant("Paradise")
                .build();

        Order order4 = new Order.Builder().build();

        List<String> items = new ArrayList<>();
        items.add("Burger");

        Order order5 = new Order.Builder()
                .customer("Alice")
                .items(items)
                .restaurant("Paradise")
                .build();

        items.add("Pizza"); // couldn't add it in items since Order is immutable because of List.Of() method

        System.out.println(order5);

    }

}
