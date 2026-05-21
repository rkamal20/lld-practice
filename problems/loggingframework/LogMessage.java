package problems.loggingframework;

import java.time.LocalDateTime;

public class LogMessage {
    LogLevel level;
    String timeStamp;
    String message;

    public LogMessage(LogLevel level, String message) {
        this.level = level;
        this.message = message;
        this.timeStamp = LocalDateTime.now().toString();
    }
}
