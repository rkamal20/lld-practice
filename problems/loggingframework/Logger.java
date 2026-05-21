package problems.loggingframework;

import java.util.*;

public class Logger {
    private static Logger instance;
    
    private LogLevel level;
    private List<Appender> appenders; 

    private Logger() {
        appenders = new ArrayList<>();
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    private void log(LogLevel level, String message) {
        if(level.ordinal() <= this.level.ordinal()) return;
        LogMessage logMessage = new LogMessage(level, message);
        for(Appender appender : appenders) {
            appender.append(logMessage);
        }
    }    

    public void debug(String message) {
        this.log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        this.log(LogLevel.INFO, message);
    }

    public void error(String message) {
        this.log(LogLevel.ERROR, message);
    }
}
