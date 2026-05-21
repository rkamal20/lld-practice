package src.designpatterns.behavioral.observer;

public class SMSNotification implements NotificationObserver {
    private String phone;

    public SMSNotification(String phone) {
        this.phone = phone;
    }

    public void update(String productName) {
        System.out.println("SMS sent to " + phone + " for product " + productName);
    }
}
