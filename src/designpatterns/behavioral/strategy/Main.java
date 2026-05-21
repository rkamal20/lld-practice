package src.designpatterns.behavioral.strategy;

public class Main {    
    public static void main(String[] args) {
        System.out.println();  // Payment System

        PaymentService paymentService = new PaymentService();          

        paymentService.setStrategy(new WalletPayment());
        paymentService.pay(500);

        paymentService.setStrategy(new UPIPayment());
        paymentService.pay(1000);

        paymentService.setStrategy(new CardPayment());
        paymentService.pay(2000);
        
        System.out.println();
    }
}
