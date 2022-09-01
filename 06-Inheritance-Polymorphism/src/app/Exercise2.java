package app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.products.ImportedProduct;
import entities.products.Product;
import entities.products.UsedProduct;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (productType) {
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    String date = sc.nextLine();
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date manufactureDate = df.parse(date);
                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;
                default:
                    products.add(new Product(name, price));
            }
            System.out.println();
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.printf(product.priceTag() + "\n");
        }

        sc.close();
    }

}
