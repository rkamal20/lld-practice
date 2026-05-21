package src.designpatterns.behavioral.strategy;

public class CardPayment implements PaymentStrategy{
    
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}
