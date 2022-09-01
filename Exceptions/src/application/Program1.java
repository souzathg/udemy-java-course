package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position."); // Without this block and line, the program would stop running when we passed an Array Index that doesn't exist.
        } catch (InputMismatchException e) {
            System.out.println("Input error."); // Without this block and line, the program would stop running when we passed a char as vector position.
        }
        System.out.println("End of program.");
    }
}
