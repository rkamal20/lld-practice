package src.problem.notificationsystem;

public class ChannelFactory {
    
    public static NotificationChannel getChannel(String channelType) {

        if (channelType.equalsIgnoreCase("EMAIL")) {
            return new EmailChannel();
        } else if (channelType.equalsIgnoreCase("SMS")) {
            return new SMSChannel(new ThirdPartySMSProvider());
        } else if (channelType.equalsIgnoreCase("PUSH")) {
            return new PushChannel();
        }
        
        return null;
    }
}
