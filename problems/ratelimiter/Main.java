package problems.ratelimiter;

public class Main {
    public static void main(String[] args) {
        System.out.println(""); // Design Rate Limiter

        String type = "Token";
        RateLimiter rateLimiter = RateLimiterFactory.getLimiter(type);

        for(int i = 1; i <= 10; i++) {
            
            boolean allowed = rateLimiter.allowRequest("user1");

            System.out.println("Request " + i + (allowed ? ": Allowed" : ": Blocked"));

            try {Thread.sleep(300);} catch (Exception e) {}
        }
    }
}
