package app;

import java.util.Locale;
import java.util.Scanner;

import classes.BankAccount;

public class BankProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        while (option != 'y' && option != 'n') {
            System.out.println("Invalid option. Please, enter 'y' or 'n'.");
            option = sc.next().charAt(0);
        }

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, holder, initialDeposit);
        } else {
            account = new BankAccount(number, holder);
        }

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
