package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] size = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, sc);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(getSum(matrix));
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = currentRow;
        }
    }
}
