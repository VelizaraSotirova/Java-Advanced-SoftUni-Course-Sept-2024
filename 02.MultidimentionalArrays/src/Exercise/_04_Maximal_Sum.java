package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Maximal_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tokens = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, sc);

        int maxSum = Integer.MIN_VALUE;
        int startColIndex = 0;
        int startRowIndex = 0;

        //For-loop from 0 to row - 2 and cols - 2
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = 0;

                for (int currentRow = row; currentRow < row + 3; currentRow++) {
                    for (int currentCol = col; currentCol < col + 3; currentCol++) {
                        sum += matrix[currentRow][currentCol];
                    }
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    startRowIndex = row;
                    startColIndex = col;
                }
            }
        }

        System.out.printf("Sum = %d\n", maxSum);
        printMaxSumMatrix(matrix, startRowIndex, startColIndex);
    }

    private static void printMaxSumMatrix(int[][] matrix, int startRowIndex, int startColIndex) {
        for (int row = startRowIndex; row < startRowIndex + 3; row++) {
            for (int col = startColIndex; col < startColIndex + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
