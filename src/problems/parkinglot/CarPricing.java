package src.problems.parkinglot;

public class CarPricing implements PricingStrategy {

    @Override
    public double calculateFare(long durationMillis) {
        double hours = 1 + (int) durationMillis / (60 * 60 * 1000);
        return 50 * hours;
    }
}
