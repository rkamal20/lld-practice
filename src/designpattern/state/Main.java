package src.designpattern.state;

public class Main {
    
    public static void main(String[] args) {
        
        // Vending Machine

        VendingMachine vm = new VendingMachine();

        // vm.insertMoney();
        // vm.selectProduct();
        // vm.dispense();

        vm.selectProduct();
        vm.dispense();

        vm.insertMoney();

        vm.insertMoney();
        vm.dispense();

        vm.selectProduct();

        vm.insertMoney();
        vm.selectProduct();

        vm.dispense();

    }
}
