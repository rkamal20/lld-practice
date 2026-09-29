package src.problem.splitwise;

import java.util.*;

public interface SplitStrategy {
    List<Split> split(double amount, List<User> users, List<Integer> values);
}
