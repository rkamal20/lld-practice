package src.problem.notificationsystem;

import java.util.List;

public class NotificationService {
    
    public void sendNotification(User user, Notification notification, List<ChannelType> channelTypes) {
        for (ChannelType channelType : channelTypes) {
            NotificationChannel channel = ChannelFactory.getChannel(channelType.name());
            if (channel != null) {
                channel.sendNotification(user, notification);
            } else {
                System.out.println("Invalid channel type: " + channelType);
            }
        }
    }
}