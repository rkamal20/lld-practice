package src.problems.loggingframework;

public class ConsoleAppender implements Appender {
    Formatter formatter;

    public ConsoleAppender(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void append(LogMessage logMessage) {
        System.out.println("Writing to Console: " + formatter.format(logMessage));
    }
}
