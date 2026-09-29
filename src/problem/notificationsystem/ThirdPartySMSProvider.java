package src.problem.notificationsystem;

public class ThirdPartySMSProvider {
    
    public void sendSMS(String phoneNumber, String message) {
        
        System.out.println("Sent SMS to " + phoneNumber + ": " + message);
    }
}
