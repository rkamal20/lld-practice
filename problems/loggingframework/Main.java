package problems.loggingframework;

public class Main {
    public static void main(String[] args) {
        System.out.println(""); // Design Logging Framework

        Logger logger = LoggerFactory.createLogger();

        logger.debug("Fetching payment details");
        logger.info("User logged in");
        logger.error("Payment failed");

        System.out.println();
    }
}
