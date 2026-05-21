package src.designpatterns.behavioral.strategy;

public class WalletPayment implements PaymentStrategy {
    
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
