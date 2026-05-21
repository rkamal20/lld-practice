package src.problems.splitwise;

import java.util.*;

public class EqualStrategy implements SplitStrategy {

    @Override
    public List<Split> split(double amount, List<User> users) {
        List<Split> splits = new ArrayList<>();
        double share = amount / users.size();
        for(User user : users) {
            splits.add(new Split(user, share));
        }
        return splits;
    }
}
