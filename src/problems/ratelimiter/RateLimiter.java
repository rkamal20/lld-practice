package src.problems.ratelimiter;

public interface RateLimiter {
    
    boolean allowRequest(String userId);
}
