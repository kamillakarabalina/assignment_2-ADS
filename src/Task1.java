import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<BankAccount> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        list.add(new BankAccount(1, "Ali", 150000));
        list.add(new BankAccount(2, "Sara", 220000));

        System.out.print("Enter account number: ");
        int num = sc.nextInt();

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        list.add(new BankAccount(num, user, bal));
        System.out.println("Account added successfully");
        System.out.println();

        System.out.println("Accounts List:");
        for (BankAccount a : list) {
            a.show();
        }

        System.out.print("Search username: ");
        String name = sc.next();

        boolean found = false;

        for (BankAccount a : list) {
            if (a.username.equalsIgnoreCase(name)) {
                System.out.println("Account found:");
                a.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Account not found");
        }
    }
}