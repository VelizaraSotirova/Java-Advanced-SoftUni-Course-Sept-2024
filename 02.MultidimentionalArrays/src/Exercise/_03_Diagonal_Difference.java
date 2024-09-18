package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, sc);
        int primaryDiagonalSum = getPrimaryDiagonal(matrix);
        int secondaryDiagonalSum = getSecondaryDiagonal(matrix);

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    private static int getSecondaryDiagonal(int[][] matrix) {
        int secondaryDiagonalSum = 0;
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            secondaryDiagonalSum += matrix[row][col];
            col++;
        }
        return secondaryDiagonalSum;
    }

    private static int getPrimaryDiagonal(int[][] matrix) {
       int primaryDiagonalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            primaryDiagonalSum += matrix[row][row];
        }
        return primaryDiagonalSum;
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt ).toArray();
        }
    }
}
