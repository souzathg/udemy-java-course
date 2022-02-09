package classes;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Construtores \\
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    // Getters and Setters \\
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Methods \\
    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
