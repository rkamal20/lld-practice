package src.designpatterns.creational.factory;

public class PushNotification implements Notification  {
    
    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}
