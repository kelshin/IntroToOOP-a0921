package inheritance;

public class Driver {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount("12345", 0, 11, 10000);
        BankAccount s1 = new SavingsAccount("12377", 0, 12, 10);
        System.out.println(c1.bankCode);

        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = c1;
        accounts[1] = s1;

        BankAccount b1 = new BankAccount("12345");
        BankAccount b2 = new BankAccount("12345");
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        System.out.println(b1);

    }
}
