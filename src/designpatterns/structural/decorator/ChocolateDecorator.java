package src.designpatterns.structural.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    public int cost() {
        return coffee.cost() + 30;
    }
    public String description() {
        return coffee.description() + " + Chocolate";
    }
}
