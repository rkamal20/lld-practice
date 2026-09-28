package src.designpattern.state;

public class HasMoneyState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money alreay inserted");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.err.println("Product selected");
        vendingMachine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Select product first");
    }
}
