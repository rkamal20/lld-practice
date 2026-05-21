package src.problems.loggingframework;

public class CloudAppender implements Appender{
    Formatter formatter;

    public CloudAppender(Formatter formatter) {
        this.formatter = formatter;
    }

    public void append(LogMessage logMessage) {
        System.out.println("Writing to Cloud: " + formatter.format(logMessage));
    }
}
