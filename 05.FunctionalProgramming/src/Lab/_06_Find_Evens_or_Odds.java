package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bounds =  Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = sc.nextLine();

        if (condition.equals("odd")) {
            printNumbers(bounds, number -> number % 2 != 0);
        } else if (condition.equals("even")){
            printNumbers(bounds, number -> number % 2 == 0);
        }
    }

    private static void printNumbers(int[] bounds, Predicate<Integer> condition) {
        int start = bounds[0]; int end = bounds[1];
        for (int i = start; i <= end; i++) {
            if (condition.test(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
 }
