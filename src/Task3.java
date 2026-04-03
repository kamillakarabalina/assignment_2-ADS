import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Deposit 50000 to Ali");
        stack.push("Withdraw 20000 from Ali");
        stack.push("Bill payment 10000 from Ali");

        System.out.println("Transactions:");
        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Last transaction: " + stack.peek());

        String removed = stack.pop();
        System.out.println("Undo -> " + removed + " removed");

        System.out.println();

        System.out.println("Remaining transactions:");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}