package src.problem.ratelimiter;

public interface RateLimiter {
    
    boolean allowRequest(String userId);
}
