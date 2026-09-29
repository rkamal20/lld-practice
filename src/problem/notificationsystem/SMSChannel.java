package src.problem.notificationsystem;

public class SMSChannel implements NotificationChannel {

    private ThirdPartySMSProvider smsProvider;

    public SMSChannel(ThirdPartySMSProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    @Override
    public void sendNotification(User user, Notification notification) {
        String phoneNumber = user.getPhoneNumber();
        String message = notification.getMessage();
        smsProvider.sendSMS(phoneNumber, message);
    }
    
}
