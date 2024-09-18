package Lab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class _05_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = data[0];
        int cols = data[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, sc);

        findMaxSubmatrixAndElementsSum(matrix);
    }

    private static void findMaxSubmatrixAndElementsSum (int[][] matrix) {
        int sum = 0;
        int maxSum = MIN_VALUE;
        int maxSumRowFirstElement = 0;
        int maxSumRowSecondElement = 0;
        int maxSumColFirstElement = 0;
        int maxSumColSecondElement = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumRowFirstElement = matrix[row][col];
                    maxSumRowSecondElement = matrix[row][col + 1];
                    maxSumColFirstElement = matrix[row + 1][col];
                    maxSumColSecondElement = matrix[row + 1][col + 1];
                }
            }
        }

        System.out.print(maxSumRowFirstElement + " " + maxSumRowSecondElement);
        System.out.println();
        System.out.print(maxSumColFirstElement + " " + maxSumColSecondElement);
        System.out.println();
        System.out.print(maxSum);
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = currentRow;
        }
    }
}
