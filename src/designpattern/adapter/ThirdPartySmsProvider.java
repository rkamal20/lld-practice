package src.designpattern.adapter;

public class ThirdPartySmsProvider {
    
    public void sendSMS(String phoneNumber, String message, String sender) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message + " from " + sender);
    }
}
