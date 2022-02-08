package util;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double dollarToReais(double dollarPrice, double quantity) {
        return dollarPrice * quantity * IOF;
    }
}
