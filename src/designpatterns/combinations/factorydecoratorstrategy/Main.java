package src.designpatterns.combinations.factorydecoratorstrategy;

public class Main {    
    public static void main(String[] args) {
        System.out.println(); // Payment system using Factory, Decorator, Strategy patterns

        PaymentService p = new PaymentService(); 

        p.setStrategy(new UPIPayment());
        p.pay(100);

        p.setStrategy(new WalletPayment());
        p.pay((50));

        p.setStrategy(new CardPayment());
        p.pay(2000);
        
        System.out.println();

        String type = "Card";
        PaymentStrategy strategy = StrategyFactory.getStrategy(type);

        strategy = new LoggingDecorator(strategy);
        strategy = new DiscountDecorator(strategy);

        strategy.pay(100);

        System.out.println();
    }
}
