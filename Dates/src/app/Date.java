package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now(); // Para instanciar somente a Data
        LocalDateTime d02 = LocalDateTime.now(); // Para instanciar a Data e Hora locais
        Instant d03 = Instant.now(); // Para instanciar a Data e Hora UTC.

        LocalDate d04 = LocalDate.parse("2022-05-17"); // Texto --> Data
        LocalDateTime d05 = LocalDateTime.parse("2022-05-17T01:30:26"); // Texto --> Data
        Instant d06 = Instant.parse("2022-05-17T01:30:26-03:00");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d04 = " + d04.format(format1));

    }
}
