package src.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println();  // Logger System

        UserService u = new UserService();
        PaymentService p = new PaymentService();

        u.createUser();
        p.processPayment();

        System.out.println();
    }
}
