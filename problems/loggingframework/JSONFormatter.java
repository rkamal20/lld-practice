package problems.loggingframework;


public class JSONFormatter implements Formatter {
    
    public String format(LogMessage logMessage) {
        return String.format(
            "{ \"timestamp\": \"%s\", \"level\": \"%s\", \"message\": \"%s\" }",
            logMessage.timeStamp,
            logMessage.level,
            logMessage.message
        );
    }
}
