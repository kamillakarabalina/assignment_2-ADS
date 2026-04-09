import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<BankAccount> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        list.add(new BankAccount(1, "Ali", 150000));

        System.out.print("Enter username: ");
        String name = sc.next();

        for (BankAccount a : list) {
            if (a.username.equalsIgnoreCase(name)) {   // как хочешь вводи им

                System.out.print("Deposit: ");
                double d = sc.nextDouble();
                a.balance += d;

                System.out.print("Withdraw: ");  // снять деньга
                double w = sc.nextDouble();

                if (w <= a.balance) {
                    a.balance -= w;
                } else {
                    System.out.println("Not enough money");
                }

                System.out.println("New balance: " + a.balance);
            }
        }
    }
}