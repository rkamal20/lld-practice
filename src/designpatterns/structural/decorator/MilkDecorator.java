package src.designpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public int cost() {
        return coffee.cost() + 20;
    }
    public String description() {
        return coffee.description() + " + Milk";
    }
}
