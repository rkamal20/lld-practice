package src.designpatterns.combinations.factorydecoratorstrategy;

public class StrategyFactory {

    public static PaymentStrategy getStrategy(String type) {

        if(type.equals("UPI")) return new UPIPayment();
        if(type.equals("Wallet")) return new WalletPayment();
        if(type.equals("Card")) return new CardPayment();

        throw new IllegalArgumentException("Invalid Strategy: " + type);        
    }

}
