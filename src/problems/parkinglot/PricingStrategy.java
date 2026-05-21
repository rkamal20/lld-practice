package src.problems.parkinglot;

public interface PricingStrategy {
    double calculateFare(long durationMillis);
}
