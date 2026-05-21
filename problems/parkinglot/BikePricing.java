package problems.parkinglot;

public class BikePricing implements PricingStrategy {

    @Override
    public double calculateFare(long durationMillis) {
        int hours = 1 + (int) durationMillis / (60 * 60 * 1000);
        return 20 * hours;
    }
}
