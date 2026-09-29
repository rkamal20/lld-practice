package src.problem.notificationsystem;

public class EmailChannel implements NotificationChannel {

    @Override
    public void sendNotification(User user, Notification notification) {
       
        System.out.println("Sent Email to " + user.getEmail() + ": " + notification.getMessage());
    }
    
}
