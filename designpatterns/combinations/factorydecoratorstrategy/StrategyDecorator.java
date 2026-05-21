package designpatterns.combinations.factorydecoratorstrategy;

public abstract class StrategyDecorator implements PaymentStrategy {
    protected PaymentStrategy strategy;

    public StrategyDecorator(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
