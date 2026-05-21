package src.problems.loggingframework;

public class LoggerFactory {

    public static Logger createLogger() {
        Logger logger = Logger.getInstance();

        logger.setLevel(LogLevel.INFO);

        Formatter simpleFormatter = new SimpleFormatter();
        logger.addAppender(new ConsoleAppender(simpleFormatter));

        logger.addAppender(new FileAppender(simpleFormatter));        

        Formatter jsonFormatter = new JSONFormatter();
        logger.addAppender(new CloudAppender(jsonFormatter));

        return logger;
    }
}
