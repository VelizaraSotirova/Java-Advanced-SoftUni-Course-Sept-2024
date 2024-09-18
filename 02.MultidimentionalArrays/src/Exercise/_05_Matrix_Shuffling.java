package Exercise;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class _05_Matrix_Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tokens = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];
        String[][] matrix = new String[rows][cols];

        //Fill the STRING matrix
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = sc.nextLine().split("\\s+");
        }

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] inputTokens = input.split("\\s+");

            if (inputTokens.length == 5) {
                String command = inputTokens[0];
                int row1 = Integer.parseInt(inputTokens[1]);
                int col1 = Integer.parseInt(inputTokens[2]);
                int row2 = Integer.parseInt(inputTokens[3]);
                int col2 = Integer.parseInt(inputTokens[4]);

                if (row1 >= rows || row2 >= rows || col1 >= cols || col2 >= cols) {
                    System.out.println("Invalid input!");
                } else {
                    String swapToken = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = swapToken;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            } else if (!inputTokens[0].isEmpty()) {
                System.out.println("Invalid input!");
            }

            input = sc.nextLine();
        }
    }
}
