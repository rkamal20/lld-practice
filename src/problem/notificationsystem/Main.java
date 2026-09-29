package src.problem.notificationsystem;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // Design Notification System

        NotificationService notificationService = new NotificationService();

        User user = new User("9090909099", "alice@example.com", "device_token_321");
        Notification notification = new Notification("Order delivered", LocalDateTime.now());
        List<ChannelType> channelTypes = Arrays.asList(ChannelType.EMAIL, ChannelType.SMS, ChannelType.PUSH);

        notificationService.sendNotification(user, notification, channelTypes);

        User user2 = new User("9090909099", "alice@example.com", "device_token_321");
        Notification notification2 = new Notification("Order cancelled", LocalDateTime.now());
        List<ChannelType> channelTypes2 = Arrays.asList(ChannelType.EMAIL, ChannelType.SMS, ChannelType.WhatsApp);

        notificationService.sendNotification(user2, notification2, channelTypes2);

        System.out.println();
    }
}