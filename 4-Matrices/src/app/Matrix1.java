package app;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int instance = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (instance == matrix[i][j]) {
                    System.out.printf("Position %d, %d:\n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d\n", matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Top: %d\n", matrix[i - 1][j]);
                    }
                    if (j < n-1) {
                        System.out.printf("Right: %d\n", matrix[i][j + 1]);
                    }
                    if (i < m-1) {
                        System.out.printf("Bottom: %d\n", matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();

    }
}
