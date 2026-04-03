import java.util.*;

public class MainMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<BankAccount> accounts = new LinkedList<>();
        Queue<BankAccount> requests = new LinkedList<>();

        accounts.add(new BankAccount(1, "Ali", 150000));

        System.out.println("1 Bank");
        System.out.println("2 ATM");
        System.out.println("3 Admin");

        int c = sc.nextInt();

        if (c == 1) {
            System.out.println("1 Request");
            System.out.println("2 Deposit");

            int b = sc.nextInt();

            if (b == 1) {
                System.out.print("Enter name: ");
                String name = sc.next();
                requests.add(new BankAccount(0, name, 0));
                System.out.println("Request added");
            }

            if (b == 2) {
                System.out.print("Enter username: ");
                String name = sc.next();

                for (BankAccount a : accounts) {
                    if (a.username.equals(name)) {
                        System.out.print("Deposit: ");
                        double d = sc.nextDouble();
                        a.balance += d;
                        System.out.println("New balance: " + a.balance);
                    }
                }
            }
        }

        if (c == 2) {
            for (BankAccount a : accounts) {
                a.show();
            }
        }

        if (c == 3) {
            if (!requests.isEmpty()) {
                BankAccount a = requests.poll();
                accounts.add(a);
                System.out.println("Processed: " + a.username);
            } else {
                System.out.println("No requests");
            }
        }
    }
}