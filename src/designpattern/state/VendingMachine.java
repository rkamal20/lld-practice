package src.designpattern.state;

public class VendingMachine {
    
    private VendingMachineState state;

    public VendingMachine() {
        state = new IdleState();
    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void selectProduct() {
        state.selectProduct(this);
    }

    public void dispense() {
        state.dispense(this);
    }

    void setState(VendingMachineState state) {
        this.state = state;
    }
}
