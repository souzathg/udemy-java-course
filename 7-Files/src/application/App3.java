package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {

    public static void main(String[] args) {

        String path = "/tmp/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // Will read one line of the file.

            while (line != null) { // condition to keep reading
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
