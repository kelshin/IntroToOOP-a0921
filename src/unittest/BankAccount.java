package unittest;

public class BankAccount {
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    /**
     *
     * @param amount amount to deposit
     * @return the current balance
     */
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    /**
     *
     * @param amount amount to deposit
     * @param branch true if the customer is performing the transaction
     *               at a branch with a teller. false if ATM
     * @return the current balance
     */
    public double withdraw(double amount, boolean branch) {
        if (amount > 500.00 && !branch) {
            throw new IllegalArgumentException("You can not withdraw more than $500.00");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }
}
