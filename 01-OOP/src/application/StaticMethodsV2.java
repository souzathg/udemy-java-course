// Na segunda versão, foi importada a classe CalculatorNonStatic, onde foram acrescentadas
// as funções de volume e circunferência, porém não de maneira estática.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorNonStatic;

public class StaticMethodsV2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculatorNonStatic calc = new CalculatorNonStatic();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);

        sc.close();
    }
}
