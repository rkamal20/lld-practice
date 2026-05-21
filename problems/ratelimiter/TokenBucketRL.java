package problems.ratelimiter;

import java.util.*;

public class TokenBucketRL implements RateLimiter {
    private int capacity;
    private int refillRate;  // token per second

    private Map<String, Integer> tokens = new HashMap<>();
    private Map<String, Long> lastRefillTime = new HashMap<>();

    public TokenBucketRL(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;      
    }
    
    @Override
    public synchronized boolean allowRequest(String userId) {

        long now = System.currentTimeMillis();

        tokens.putIfAbsent(userId, capacity);
        lastRefillTime.putIfAbsent(userId, now);        

        long lastTime = lastRefillTime.get(userId);
        long elapsedTime = now - lastTime;

        int tokensToAdd = refillRate * (int)elapsedTime / 1000;

        if(tokensToAdd > 0) {
            int currentTokens = Math.min(capacity, tokensToAdd + tokens.get(userId));
            tokens.put(userId, currentTokens);
            lastRefillTime.put(userId, lastTime + tokensToAdd * 1000);
        }        

        if(tokens.get(userId) > 0) {
            tokens.put(userId, tokens.get(userId) - 1);
            return true;
        }

        return false;
    }
}
