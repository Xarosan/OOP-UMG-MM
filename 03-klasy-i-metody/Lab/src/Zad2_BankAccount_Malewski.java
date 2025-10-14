import java.text.DecimalFormat;

public class Zad2_BankAccount_Malewski {
    private static String owner;
    private static double balance;
    public static void reset(String newOwner, double initialBalance) {
        owner = newOwner;
        balance = initialBalance;
    }
    public static void deposit(double amount) { balance += amount; }
    public static void withdraw(double amount) { balance -= amount;}
    public static double getBalance() { return balance; }
    public static String getOwner() { return owner; }

    public static void main(String[] args) {
        reset("Malewski",12000);

        System.out.println(getOwner());
        System.out.println(getBalance());

        deposit(346.75);
        System.out.println(getBalance());

        withdraw(2600.63);
        System.out.println(getBalance());
    }
}
