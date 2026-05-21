package designpatterns.structural.decorator;

public class Expresso implements Coffee {
    
    @Override
    public int cost() {
        return 200;
    }
    @Override
    public String description() {
        return "Expresso";
    }
}
