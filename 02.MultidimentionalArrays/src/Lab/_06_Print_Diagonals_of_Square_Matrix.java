package Lab;

import java.util.Scanner;

public class _06_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        
        printPrimaryDiagonal(matrix);
        System.out.println();
        printSecondaryDiagonal(matrix);
    }

    private static void printSecondaryDiagonal(int[][] matrix) {
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            System.out.print(matrix[row][col] + " ");
            col++;
        }
    }

    private static void printPrimaryDiagonal(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }
    }
}
