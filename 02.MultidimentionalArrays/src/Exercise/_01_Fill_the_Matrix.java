package Exercise;

import java.util.Scanner;

public class _01_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[n][n];

        switch (pattern) {
            case "A" -> fillPatternA(matrix);
            case "B" -> fillPatternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPatternB(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = count++;
                }
            }
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = count++;
            }
        }
    }
}
