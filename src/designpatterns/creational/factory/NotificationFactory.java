package src.designpatterns.creational.factory;

public class NotificationFactory {    

    public static Notification getNotification(String type) {

        if(type.equals("SMS")) return new SMSNotification();
        if(type.equals("MAIL")) return new MailNotification();
        if(type.equals("PUSH"))return new PushNotification();

        throw new IllegalArgumentException("Invalid notification type : " + type);
    }
}
