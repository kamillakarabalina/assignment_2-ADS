import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Electricity Bill");
        System.out.println("Added: Electricity Bill");

        queue.add("Internet Bill");
        System.out.println("Added: Internet Bill");

        System.out.println();

        System.out.println("Processing: " + queue.poll());

        System.out.println();

        System.out.println("Remaining:");
        for (String q : queue) {
            System.out.println(q);
        }
    }
}