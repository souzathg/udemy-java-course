package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

    public static void main(String[] args) {

        String path = "/tmp/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); // Will read one line of the file.

            while (line != null) { // condition to keep reading
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
