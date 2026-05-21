package src.designpatterns.combinations.factorydecoratorstrategy;

public class DiscountDecorator extends StrategyDecorator {
    
    public DiscountDecorator(PaymentStrategy strategy) {
        super(strategy);
    }

    @Override
    public void pay(int amount) {
        int discounted = amount - 5;
        strategy.pay(discounted);
    }
}
