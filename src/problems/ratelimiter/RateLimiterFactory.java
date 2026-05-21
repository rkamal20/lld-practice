package src.problems.ratelimiter;

public class RateLimiterFactory {
    
    public static RateLimiter getLimiter(String type) {

        if(type.equals("Token")) return new TokenBucketRL(5, 1);
        if(type.equals("Fixed")) return new FixedWindowRL(4, 1000);

        throw new IllegalArgumentException("Invalid rate limiter type: " + type);
    }
}
