package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class OOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Com orientação a objetos, podemos criar uma classe com todas as informações
        // que precisamos para aquela entidade e então instanciá-las no nosso código,
        // conforme abaixo.
        // Note que na linha 6 foi importada a classe 'Triangle', para que pudesse ser
        // utilizada.

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // Recebendo as variáveis de entrada do programa
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Cálculo da área dos triângulos com base no cálculo definido na classe
        // Triangle
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
