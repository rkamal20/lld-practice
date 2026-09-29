package src.problem.loggingframework;

public class Main {
    public static void main(String[] args) {
        System.out.println(""); // Design Logging Framework

        Logger logger = Logger.getInstance();
        logger.setLevel(LogLevel.INFO);

        Formatter simpleFormatter = new SimpleFormatter();
        logger.addAppender(new ConsoleAppender(simpleFormatter));
        logger.addAppender(new FileAppender(simpleFormatter));        

        Formatter jsonFormatter = new JSONFormatter();
        logger.addAppender(new CloudAppender(jsonFormatter));

        logger.debug("Fetching payment details");
        logger.info("User logged in");
        logger.warn("Payment gateway response delayed");
        logger.error("Payment failed");

        System.out.println();
    }
}
