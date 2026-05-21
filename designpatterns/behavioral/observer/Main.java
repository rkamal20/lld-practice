package designpatterns.behavioral.observer;

public class Main {    
    public static void main(String[] args) {
        System.out.println();  // "Notify Me" feature e-commerce 

        Product product = new Product("iPhone 18");       

        NotificationObserver o = new EmailNotification("user@gmail.com");
        
        product.addObserver(o);

        product.addObserver(new SMSNotification("234567891"));
        product.addObserver(new EmailNotification("kk@gmail.com"));
        product.addObserver(new SMSNotification("9111133222"));        

        product.setStock(10);

        product.removeObserver(o);
        System.out.println();
        
        product.setStock(20);

        System.out.println();
    }
}
