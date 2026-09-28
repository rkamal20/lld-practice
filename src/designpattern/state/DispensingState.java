package src.designpattern.state;

public class DispensingState implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Cannot insert money while dispensing");   
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.err.println("Cannot select product while dispensing");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Product dispensed");
        vendingMachine.setState(new IdleState());
    }

    
} 
