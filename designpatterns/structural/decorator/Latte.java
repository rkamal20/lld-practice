package designpatterns.structural.decorator;

public class Latte implements Coffee{
    
    @Override
    public int cost() {
        return 100;
    }    
    @Override
    public String description() {
        return "Latte";
    }
}
