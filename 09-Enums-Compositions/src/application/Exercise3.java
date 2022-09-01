package application;

import entities.Client;
import entities.OrderItem;
import entities.OrderNew;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.next();
        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf1.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next().toUpperCase());

        OrderNew order = new OrderNew(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.printf("Enter #%d item data:\n", i);
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem item = new OrderItem(quantity, new Product(productName, productPrice));

            order.addItem(item);
        }

        System.out.printf("Order moment: %s\n", sdf2.format(order.getMoment()));
        System.out.printf("Order status: %s\n", order.getStatus());
        System.out.printf("Client: %s\n", order.getClient());
        System.out.println("Order items:");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.toString());
        }
        System.out.printf("Total price: %.2f\n", order.total());

        sc.close();
    }
}
