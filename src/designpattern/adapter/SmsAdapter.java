package src.designpattern.adapter;

public class SmsAdapter implements NotificationProvider {

    private final ThirdPartySmsProvider provider;

    public SmsAdapter(ThirdPartySmsProvider provider) {
        this.provider = provider;
    }

    @Override
    public void send(String receiver, String message) {

        provider.sendSMS(receiver, message, "MY_APP");
    }
    
}
