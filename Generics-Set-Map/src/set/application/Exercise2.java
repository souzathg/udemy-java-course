package set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> students = new HashSet<>();

        char[] courses = {'A', 'B', 'C'};
        for (char course : courses) {
            System.out.print("How many students for course " + course + "? ");
            int quantity = sc.nextInt();
            for (int i = 0; i < quantity; i++) {
                int student = sc.nextInt();
                students.add(student);
            }
        }
        System.out.println("Total students: " + students.size());
        sc.close();
    }
}
