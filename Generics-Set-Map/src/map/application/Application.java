package map.application;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> votes = new TreeMap<>();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter file full path: ");

            File file = new File(sc.nextLine());

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.replaceAll(", ", ",");
                    String[] split = line.split(",");

                    if (votes.get(split[0]) != null) {
                        votes.put(split[0], votes.get(split[0]) + Integer.parseInt(split[1]));
                    } else {
                        votes.put(split[0], Integer.parseInt(split[1]));
                    }
                }
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        }
    }
}
