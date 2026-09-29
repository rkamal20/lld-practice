package src.problem.notificationsystem;

public class PushChannel implements NotificationChannel {

    @Override
    public void sendNotification(User user, Notification notification) {
        
        System.out.println("Sent Push Notification to " + user.getDeviceToken() + ": " + notification.getMessage());
    }

}
