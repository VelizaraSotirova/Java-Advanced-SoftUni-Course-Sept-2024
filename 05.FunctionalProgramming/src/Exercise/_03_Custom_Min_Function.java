package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _03_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Function<Integer[], Integer> findSmallestNumber = arr -> {
            int minNumber = Integer.MAX_VALUE;

            for (Integer number : arr) {
                if (number < minNumber) {
                    minNumber = number;
                }
            }

            return minNumber;
        };

        Integer[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer smallestNumber = findSmallestNumber.apply(numbers);
        System.out.println(smallestNumber);
    }
}
