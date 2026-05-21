package src.designpatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    public int cost() {
        return coffee.cost() + 10;
    }
    public String description() {
        return coffee.description() + " + Sugar";
    }
}
