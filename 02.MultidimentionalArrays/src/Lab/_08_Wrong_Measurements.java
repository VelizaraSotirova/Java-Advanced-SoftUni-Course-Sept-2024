package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read the row count through the console
        int n = Integer.parseInt(scanner.nextLine());
        //create a matrix with n rows
        int[][] matrix = new int[n][];

        //fill the matrix
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        //read the wrong value
        int[] wrongValueTokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wrongValue = matrix[wrongValueTokens[0]][wrongValueTokens[1]];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int correctValue = getNearbySum(matrix, r, c, wrongValue);
                    System.out.print(correctValue + " ");
                } else {
                    System.out.print(matrix[r][c] + " ");
                }
            }

            System.out.println();
        }
    }

    private static int getNearbySum(int[][] matrix, int r, int c, int wrongValue) {
        int sum = 0;

        if (isInBounds(matrix, r + 1, c) && matrix[r + 1][c] != wrongValue) {
            sum += matrix[r + 1][c];
        }

        if (isInBounds(matrix, r - 1, c) && matrix[r - 1][c] != wrongValue) {
            sum += matrix[r - 1][c];
        }

        if (isInBounds(matrix, r, c - 1) && matrix[r][c - 1] != wrongValue) {
            sum += matrix[r][c - 1];
        }

        if (isInBounds(matrix, r, c + 1) && matrix[r][c + 1] != wrongValue) {
            sum += matrix[r][c + 1];
        }

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
