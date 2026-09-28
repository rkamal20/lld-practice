package src.extra.factorydecoratorstrategy;

public class UPIPayment implements PaymentStrategy {
    
    public void pay(int amout) {
        System.out.println("Paid " + amout + " using UPI");
    }
}
