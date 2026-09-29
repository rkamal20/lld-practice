package src.problem.notificationsystem;

public class User {
    private String phoneNumber;
    private String email;
    private String deviceToken;

    public User(String phoneNumber, String email, String deviceToken) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.deviceToken = deviceToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public String getDeviceToken() {
        return deviceToken;
    }
}
