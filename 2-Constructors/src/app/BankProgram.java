package app;

import java.util.Locale;
import java.util.Scanner;

import classes.BankAccount;

public class BankProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String option = sc.nextLine();

        while (!option.equals("y") && !option.equals("n")) {
            System.out.println("Invalid option. Please, enter 'y' or 'n'.");
            option = sc.nextLine();
        }

        double initialDeposit = 0;

        if (option.equals("y")) {

            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        BankAccount account = new BankAccount(accountNumber, holderName, initialDeposit);

        System.out.println();
        System.out.println("Account data:\n" + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();

        account.deposit(value);

        System.out.println("Updated data:\n" + account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();

        account.withdraw(value);

        System.out.println("Updated data:\n" + account);

        sc.close();
    }
}
