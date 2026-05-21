package problems.splitwise;

import java.util.*;

public class ExpenseManager {
    List<User> users;
    BalanceSheet balanceSheet;
    List<Expense> expenses; 

    public ExpenseManager() {
        this.users = new ArrayList<>();
        this.balanceSheet = new BalanceSheet();
        expenses = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addExpense(double amount, User paidBy, List<User> participatedUsers, SplitStrategy strategy) {
        List<Split> splits = strategy.split(amount, participatedUsers);
        balanceSheet.updateBalance(paidBy, splits);
    }

    public void simplifyExpenses() {
        balanceSheet.simplifyBalances();
    }

    public void showBalances() {
        this.balanceSheet.showBalances();
    }

    public void showAllExpenses() {
        // Later
    }
}
