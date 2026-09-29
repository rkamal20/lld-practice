package src.problem.splitwise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(""); // design splitwise

        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");
        User u3 = new User(3, "Charlie");

        ExpenseManager e = new ExpenseManager();

        e.addUser(u1);
        e.addUser(u2);
        e.addUser(u3);

        e.addExpense(300, u1, Arrays.asList(u1, u2, u3), null,  new EqualStrategy());
        e.addExpense(100, u2, Arrays.asList(u2, u3), Arrays.asList(70, 30), new PercentageSplit());
        e.addExpense(200, u3, List.of(u1, u3), Arrays.asList(150, 50), new ExactSplit());
  
        e.showBalances();    
        System.out.println();
        
        e.simplifyExpenses();
        System.out.println();
        
        e.showAllExpenses();

        System.out.println();
    }
}
