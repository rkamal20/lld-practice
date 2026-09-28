package src.designpattern.adapter;

public class EmailNotificationProvider implements NotificationProvider {

    @Override
    public void send(String receiver, String message) {
        System.out.println("Email sent to " + receiver + ": " + message);
    }
    
    
}
