package src.problem.splitwise;

import java.util.*;

public class ExactSplit implements SplitStrategy {

    @Override
    public List<Split> split(double amount, List<User> users, List<Integer> values) {


        if(users.size() != values.size()) {
            throw new IllegalArgumentException("Users and values size mismatch");
        }

        double totalValue = values.stream().mapToInt(Integer::intValue).sum();
        if (totalValue != amount) {
            throw new IllegalArgumentException("Values must sum to the expense amount");
        }

        List<Split> splits = new ArrayList<>();
        for(int i = 0; i < users.size(); i++) {
            splits.add(new Split(users.get(i), values.get(i)));
        }
        return splits;
    }
    
}
