package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _09_List_of_Predicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Integer> divisors = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Predicate<Integer>> predicates = new ArrayList<>();
        for (Integer divisor : divisors) {
            // num -> num % divisor == 0
            Predicate<Integer> predicate = num -> num % divisor == 0;
            predicates.add(predicate);
        }

        for (int number = 1; number <= n; number++) {
            boolean isDivisibleInAllPredicates = true;
            for (Predicate<Integer> predicate : predicates) {
                if (!predicate.test(number)) {
                    isDivisibleInAllPredicates = false;
                }
            }
            if (isDivisibleInAllPredicates){
                System.out.print(number + " ");
            }
        }
    }
}
