package src.problems.splitwise;

import java.util.*;

public interface SplitStrategy {
    List<Split> split(double amount, List<User> users);
}
