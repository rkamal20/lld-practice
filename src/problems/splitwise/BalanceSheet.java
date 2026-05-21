package src.problems.splitwise;

import java.util.*;;

public class BalanceSheet {
    Map<User, Map<User, Double>> balances;

    public BalanceSheet() {
        this.balances = new HashMap<>();
    }

    public void updateBalance(User user, List<Split> splits) {
        for(Split s : splits) {
            if(s.user.id == user.id) continue;
            if(!balances.containsKey(s.user)) balances.put(s.user,  new HashMap<>());
            Map<User, Double> userMap = balances.get(s.user);
            userMap.put(user, s.amount + userMap.getOrDefault(user, 0.0));
            balances.put(s.user, userMap);
        }
    }

    public void showBalances() {
        System.out.println(".......Who owes Whom........");
        for(User debtor : balances.keySet()) {
            for(User creditor : balances.get(debtor).keySet()) {
                System.out.printf("%s owes %s $%.2f%n", debtor.name, creditor.name, balances.get(debtor).get(creditor));
            }
        }
    }

    public void simplifyBalances() {
        Map<User, Double> userMap = new HashMap<>();
        for(User debtor : balances.keySet()) {
            for(User creditor : balances.get(debtor).keySet()) {
                userMap.put(debtor, userMap.getOrDefault(debtor, 0.0) - balances.get(debtor).get(creditor));
                userMap.put(creditor, userMap.getOrDefault(creditor, 0.0) + balances.get(debtor).get(creditor));
            }
        }
        PriorityQueue<UserBalance> debtUsers = new PriorityQueue<>((s1, s2) -> (int) Math.ceil(s2.amount - s1.amount));
        PriorityQueue<UserBalance> creditUsers = new PriorityQueue<>((s1, s2) -> (int) Math.ceil(s2.amount - s1.amount));
        for(User u : userMap.keySet()) {
            if(userMap.get(u) == 0) continue;
            double amount = userMap.get(u);
            UserBalance ub = new UserBalance(u, amount < 0 ? -amount : amount);
            if(amount < 0) debtUsers.offer(ub);
            if(amount > 0) creditUsers.offer(ub);
        }
        System.out.println(".......Simplified Expenses..........");
        while (!debtUsers.isEmpty() && !creditUsers.isEmpty()) {
            double min = Math.min(creditUsers.peek().amount, debtUsers.peek().amount);
            UserBalance creditor = creditUsers.poll();
            UserBalance debtor = debtUsers.poll();
            System.out.printf("%s owes %s $%.2f%n", debtor.user.name, creditor.user.name, min);
            if(debtor.amount > min) debtUsers.offer(new UserBalance(debtor.user, debtor.amount - min));
            if(creditor.amount > min) creditUsers.offer(new UserBalance(creditor.user, creditor.amount - min));
        }
    }
}
