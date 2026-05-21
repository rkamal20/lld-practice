package problems.splitwise;

import java.util.*;

public class Expense {
    double amount;
    User paidBy;
    List<Split> splits;

    public Expense(double amount, User paidBy, List<Split> splits) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
    }
}
