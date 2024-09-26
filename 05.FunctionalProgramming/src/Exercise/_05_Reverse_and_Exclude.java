package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _05_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        int n = Integer.parseInt(sc.nextLine());

        //Create a predicate that removes elements which are divisible by a given integer n
        Predicate<Integer> isNotDivisibleByN = number -> number % n != 0;

        Consumer<Integer> print = number -> System.out.print(number + " ");

        numbers.stream().filter(isNotDivisibleByN).forEach(print);
    }
}
