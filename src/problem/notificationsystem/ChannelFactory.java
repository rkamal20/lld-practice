package src.problem.notificationsystem;

public class ChannelFactory {
    
    public static NotificationChannel getChannel(ChannelType channelType) {

        switch (channelType) {
            case EMAIL:
                return new EmailChannel();
            case SMS:
                return new SMSChannel(new ThirdPartySMSProvider());
            case PUSH:
                return new PushChannel();
            default:
                return null;
        }
    }
}
