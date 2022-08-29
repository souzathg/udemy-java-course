package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer contractNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date contractStartDate = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        Double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractStartDate, contractValue);

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, installments);

        System.out.println("Installments:");
        for (Installment it : contract.getInstallments()) {
            System.out.println(it);
        }

        sc.close();
    }
}
