import java.util.*;       //Withdraw = снять деньги со счёта заметка камы

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<BankAccount> accounts = new LinkedList<>();
        Queue<BankAccount> requests = new LinkedList<>();

        accounts.add(new BankAccount(1, "Ali", 150000));

        int nextId = 2;
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n1 Bank");
            System.out.println("2 ATM");
            System.out.println("3 Admin");
            System.out.println("0 Exit");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1 Request");
                System.out.println("2 Deposit");

                int bankChoice = sc.nextInt();

                if (bankChoice == 1) {
                    System.out.print("Enter name: ");
                    String name = sc.next();

                    requests.add(new BankAccount(0, name, 0));
                    System.out.println("Request added");
                }

                else if (bankChoice == 2) {
                    System.out.print("Enter username: ");
                    String name = sc.next();

                    boolean found = false;

                    for (BankAccount a : accounts) {
                        if (a.username.equalsIgnoreCase(name)) {
                            System.out.print("Deposit: ");
                            double d = sc.nextDouble();
                            a.balance = a.balance + d;
                            System.out.println("New balance: " + a.balance);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("User not found");
                    }
                }
            }

            else if (choice == 2) {
                System.out.println("1 Check balance");
                System.out.println("2 Withdraw");

                int atmChoice = sc.nextInt();

                if (atmChoice == 1) {
                    System.out.print("Enter username: ");
                    String name = sc.next();

                    boolean found = false;

                    for (BankAccount a : accounts) {
                        if (a.username.equalsIgnoreCase(name)) {
                            a.show();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("User not found");
                    }
                }

                else if (atmChoice == 2) {
                    System.out.print("Enter username: ");
                    String name = sc.next();

                    boolean found = false;

                    for (BankAccount a : accounts) {
                        if (a.username.equalsIgnoreCase(name)) {
                            System.out.print("Withdraw: ");
                            double w = sc.nextDouble();

                            if (w <= a.balance) {
                                a.balance = a.balance - w;
                                System.out.println("New balance: " + a.balance);
                            } else {
                                System.out.println("Not enough money");
                            }

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("User not found");
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("1 Process request");
                System.out.println("2 Show requests");

                int adminChoice = sc.nextInt();

                if (adminChoice == 1) {
                    if (!requests.isEmpty()) {
                        BankAccount a = requests.poll();
                        a.accountNumber = nextId;
                        nextId++;

                        accounts.add(a);
                        System.out.println("Processed: " + a.username);
                    } else {
                        System.out.println("No requests");
                    }
                }

                else if (adminChoice == 2) {
                    if (requests.isEmpty()) {
                        System.out.println("No requests");
                    } else {
                        for (BankAccount a : requests) {
                            System.out.println(a.username);
                        }
                    }
                }
            }

            else if (choice == 0) {
                System.out.println("Program ended");
            }

            else {
                System.out.println("Wrong choice");
            }
        }

        sc.close();
    }
}