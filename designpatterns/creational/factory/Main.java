package designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // Notification System

        NotificationService n = new NotificationService();

        String message = "Order has been shipped";

        n.send("SMS", message);
        n.send("MAIL", message);
        n.send("PUSH", message);

        System.out.println();
    }
}
