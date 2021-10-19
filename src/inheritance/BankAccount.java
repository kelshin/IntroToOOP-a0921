package inheritance;



public class BankAccount {
    private String accountNumber;
    private double balance;
    protected int bankCode;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, int bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public boolean equals(Object o) {
        // defines what's equal for BankAccount

        // same memory address?
        if (this == o) { return true; }
        // same type?
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        BankAccount that = (BankAccount) o;  // down-casting
        // do they have the same account number?
        return this.accountNumber.equals(that.accountNumber);
    }

    @Override
    public String toString() {
        // the string representation
        return "BankAccount[accountNumber=" + this.accountNumber + "]";
    }
}

