package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n"
                + "%s\n", student.finalGrade(), student.finalTest());

        sc.close();
    }
}
