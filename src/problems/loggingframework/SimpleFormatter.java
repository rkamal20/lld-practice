package src.problems.loggingframework;

public class  SimpleFormatter implements Formatter {
    
    public String format(LogMessage logMessage) {
        return logMessage.timeStamp + " [ " + logMessage.level + " ] " + logMessage.message;
    }
}
