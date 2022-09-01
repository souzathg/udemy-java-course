package classes;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    // Construtores \\
    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Getters and Setters \\
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
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
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
