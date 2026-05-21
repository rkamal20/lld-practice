package src.designpatterns.creational.singleton;

public class PaymentService {

    public void processPayment() {        
        Logger logger = Logger.getInstance();
        logger.log("Payment processed");

        //System.out.println(logger.hashCode());
    }
}
