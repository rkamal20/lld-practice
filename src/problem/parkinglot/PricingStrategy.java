package src.problem.parkinglot;

public interface PricingStrategy {
    double calculateFare(long durationMillis);
}
