package designpatterns.creational.factory;

public class NotificationService {
    
    public void send(String type, String message) {
        Notification notification = NotificationFactory.getNotification(type);
        notification.send(message);
    }
}
