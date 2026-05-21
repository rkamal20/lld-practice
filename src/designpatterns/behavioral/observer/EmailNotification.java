package src.designpatterns.behavioral.observer;

public class EmailNotification implements NotificationObserver {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    public void update(String productName) {
        System.out.println("Email sent to " + email + " for product " + productName);
    }
}
