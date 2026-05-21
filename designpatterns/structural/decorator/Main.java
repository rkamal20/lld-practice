package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // Coffee System

        Coffee coffee = new Expresso();
        
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);

        System.out.println(coffee.description());
        System.out.println("Total Cost: " + coffee.cost());

        System.out.println();
    }
}
