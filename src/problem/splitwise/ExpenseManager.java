package src.problem.splitwise;

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

    public void addExpense(double amount, User paidBy, List<User> participatedUsers, List<Integer> values, SplitStrategy strategy) {
        List<Split> splits = strategy.split(amount, participatedUsers, values);
        balanceSheet.updateBalance(paidBy, splits);
        expenses.add(new Expense(amount, paidBy, splits));
    }

    public void simplifyExpenses() {
        balanceSheet.simplifyBalances();
    }

    public void showBalances() {
        this.balanceSheet.showBalances();
    }

    public void showAllExpenses() {
        for (Expense expense : expenses) {
            System.out.println("Expense of amount " + expense.amount + " paid by " + expense.paidBy.name);
            for (Split split : expense.splits) {
                System.out.println("  " + split.user.name + " owes " + split.amount);
            }
        }
    }
}
