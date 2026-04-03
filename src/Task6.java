public class Task6 {
    public static void main(String[] args) {

        BankAccount[] arr = new BankAccount[3];

        arr[0] = new BankAccount(1, "Ali", 100000);
        arr[1] = new BankAccount(2, "Sara", 200000);
        arr[2] = new BankAccount(3, "John", 300000);

        System.out.println("Accounts stored in array:");

        for (BankAccount a : arr) {
            a.show();
        }
    }
}