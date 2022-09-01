package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data\n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                System.out.println();

            } else {
                list.add(new Employee(name, hours, valuePerHour));
                System.out.println();
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.printf(emp.getName() + " - $ " + String.format("%.2f", emp.payment()) + "\n");
        }

        sc.close();
    }

}
