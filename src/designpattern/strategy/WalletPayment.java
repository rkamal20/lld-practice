package src.designpattern.strategy;

public class WalletPayment implements PaymentStrategy {
    
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
