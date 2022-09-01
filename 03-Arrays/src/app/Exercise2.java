package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Employee3;

public class Exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        List<Employee3> employees = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d:\n", i + 1);

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee3 employee = new Employee3(id, name, salary);

            employees.add(employee);

            System.out.println();
        }

        System.out.print("Enter the employee id that will have his salary increased: ");
        int id = sc.nextInt();
        sc.nextLine();

        int idIndex = -1;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                idIndex = i;
            }
        }

        if (idIndex == -1) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            sc.nextLine();

            employees.get(idIndex).salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee3 employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
