package src.problems.parkinglot;

public class StrategyFactory {
    
    public static PricingStrategy getStrategy(VehicleType type) {
        
        if(type.equals(VehicleType.CAR)) return new CarPricing();
        if(type.equals(VehicleType.BIKE)) return new BikePricing();

        throw new IllegalArgumentException("Invalid vehicle type: " + type);                              
    }
}
