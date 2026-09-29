package src.problem.notificationsystem;

import java.time.LocalDateTime;

public class Notification {
    private String message;
    private LocalDateTime createdAt;

    public Notification(String message, LocalDateTime createdAt) {
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
