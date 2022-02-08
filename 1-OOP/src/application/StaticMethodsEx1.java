package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class StaticMethodsEx1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        CurrencyConverter.dollarToReais(dollarPrice, quantity);

        System.out.printf("Amout to be paid in reais = %.2f\n", CurrencyConverter.dollarToReais(dollarPrice, quantity));

        sc.close();
    }
}
