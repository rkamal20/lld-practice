package src.designpattern.adapter;

public class Main {

    public static void main(String[] args) {

        // Notification System

        NotificationProvider provider = new EmailNotificationProvider();
        NotificationService service = new NotificationService(provider);
        service.sendNotification("Alice", "Order has delivered");

        ThirdPartySmsProvider provider2 = new ThirdPartySmsProvider();
        NotificationProvider smsAdapter = new SmsAdapter(provider2);
        NotificationService service2 = new NotificationService(smsAdapter);
        service2.sendNotification("Bob", "Order has shipped");

    }

}
