package Week4;

public class Ex72 {
    public static void main(String[] args) {
        Account A = new Account("A account", 100);
        Account B = new Account("B account", 0);
        Account C = new Account("C account", 0);

        transfer(A, B,50);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        transfer(B, C,25);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
