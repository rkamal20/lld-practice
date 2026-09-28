package src.designpattern.state;

public class IdleState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money inserted");
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.err.println("Insert money first");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Insert money first");
    }
}
