package app;

import java.util.Locale;
import java.util.Scanner;

import classes.Student3;

public class Exercise1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Student3[] students = new Student3[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.println();

            students[room] = new Student3(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.printf("%d: %s, %s\n", students[i].getRoom(), students[i].getName(), students[i].getEmail());
            }
        }
        sc.close();
    }
}
