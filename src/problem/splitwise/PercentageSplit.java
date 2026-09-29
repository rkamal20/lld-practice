package src.problem.splitwise;

import java.util.*;

public class PercentageSplit implements SplitStrategy {
    
    @Override
    public List<Split> split(double amount, List<User> users, List<Integer> values) {
        
        double totalPercentage = 0;
        for (int percentage : values) {
            totalPercentage += percentage;
        }

        if (totalPercentage != 100) {
            throw new IllegalArgumentException("Percentages must sum to 100");
        }

        List<Split> splits = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            double share = (amount * values.get(i)) / totalPercentage;
            splits.add(new Split(users.get(i), share));
        }
        return splits;
    }
    
}
