package Lab;

import java.util.Scanner;

public class _01_Compare_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        fillMatrix(matrixA, sc);

        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        fillMatrix(matrixB, sc);

        boolean areEqual = areEqual(matrixA, matrixB);

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean areEqual(int[][] matrixA, int[][] matrixB) {
        if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            return false;
        }

        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
