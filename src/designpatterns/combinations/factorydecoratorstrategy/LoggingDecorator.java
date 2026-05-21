package src.designpatterns.combinations.factorydecoratorstrategy;

import src.designpatterns.creational.singleton.Logger;

public class LoggingDecorator extends StrategyDecorator {
    
    public LoggingDecorator(PaymentStrategy strategy) {
        super(strategy);
    }

    @Override
    public void pay(int amount) {
        strategy.pay(amount);
        
        Logger logger = Logger.getInstance();
        logger.log(amount + " is paid successfully");        
    }
}
