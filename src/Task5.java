import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Queue<BankAccount> requests = new LinkedList<>();
        LinkedList<BankAccount> accounts = new LinkedList<>();

        requests.add(new BankAccount(3, "Nurlan", 0));
        requests.add(new BankAccount(4, "Aigerim", 0));

        System.out.println("Pending requests:");
        for (BankAccount r : requests) {
            System.out.println(r.username);
        }

        System.out.println();

        System.out.println("Processing request...");
        BankAccount acc = requests.poll();

        accounts.add(acc);

        System.out.println("Added account:");
        acc.show();

        System.out.println("Accounts in main LinkedList:");
        for (BankAccount a : accounts) {
            a.show();
        }
    }
}