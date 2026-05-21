package src.designpatterns.creational.factory;

public class MailNotification implements Notification{
    
    @Override
    public void send(String message) {
        System.out.println("Mail: " + message);
    }
}
