package src.designpattern.adapter;

public class NotificationService {
    
    private final NotificationProvider provider;

    public NotificationService(NotificationProvider provider) {
        this.provider = provider;
    }

    public void sendNotification(String receiver, String message) {
        provider.send(receiver, message);
    }

}
