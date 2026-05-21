package src.designpatterns.behavioral.strategy;

public class UPIPayment implements PaymentStrategy {
    
    public void pay(int amout) {
        System.out.println("Paid " + amout + " using UPI");
    }
}
