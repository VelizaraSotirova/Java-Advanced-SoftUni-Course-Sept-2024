package Lab;

import java.util.Scanner;

public class _02_Positions_Of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int number = sc.nextInt();
        boolean isNumberFound = false;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    isNumberFound = true;
                }
            }
        }

        if(!isNumberFound) {
            System.out.println("not found");
        }
    }
}
