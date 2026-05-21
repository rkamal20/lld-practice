package problems.ratelimiter;

import java.util.*;

public class FixedWindowRL implements RateLimiter {
    private int limit;
    private int windowSize;

    private Map<String, Integer> counter = new HashMap<>();
    private Map<String, Long> windowStart = new HashMap<>();

    public FixedWindowRL(int limit, int windowSize) {
        this.limit = limit;
        this.windowSize = windowSize;
    }

    @Override
    public synchronized boolean allowRequest(String userId) {
        
        long now = System.currentTimeMillis();
        
        windowStart.putIfAbsent(userId, now);
        counter.putIfAbsent(userId, 0);

        long lastTime = windowStart.get(userId);

        if(now - lastTime > windowSize) {
            windowStart.put(userId, now);
            counter.put(userId, 0);
        }

        if(counter.get(userId) < this.limit) {
            counter.put(userId, counter.get(userId) + 1);
            return true;
        }
        return false;
    }
}
