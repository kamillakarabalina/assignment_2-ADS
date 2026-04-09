public class Task1 {

    static class Node {
        int accountNumber;
        String username;
        double balance;
        Node next;

        Node(int accountNumber, String username, double balance) {
            this.accountNumber = accountNumber;
            this.username = username;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(1, "Ali", 150000);
        Node second = new Node(2, "Sara", 220000);

        first.next = second;

        Node third = new Node(3, "Kama", 300000);
        second.next = third;

        Node current = first;

        System.out.println("Accounts:");

        while (current != null) {
            System.out.println("Account Number: " + current.accountNumber);
            System.out.println("Username: " + current.username);
            System.out.println("Balance: " + current.balance);
            System.out.println();

            current = current.next;
        }
    }
}