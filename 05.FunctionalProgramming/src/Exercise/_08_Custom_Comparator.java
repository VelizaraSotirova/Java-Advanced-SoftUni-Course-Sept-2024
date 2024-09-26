package Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _08_Custom_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        //Comparator: Lambda expression, which takes 2 arguments and returns integer (-1, 0 1)
        //sorted(-1) - doesn't change the elements
        //sorted(0) - doesn't change the elements
        //sorted(1) - changes the elements

        Comparator<Integer> customComparator = (first, second) -> {
            // If the first number is odd and the second one is even -> change the elements
            if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
            // If the first number is even and the second one is odd -> don't change the elements
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }

            // Sorting the numbers in ascending order
            return first.compareTo(second);
        };

        numbers.stream().sorted(customComparator).forEach(n -> System.out.print(n + " "));
    }
}
