package problems.loggingframework;

public class FileAppender implements Appender {
    Formatter formatter;

    public FileAppender(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void append(LogMessage logMessage) {
        System.out.println("Writing to File: " + formatter.format(logMessage));
    }
}
