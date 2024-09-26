package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class _02_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(", "))
                .map(Integer::parseInt).toList();

        int numbersCount = numbers.size();
        Function<List<Integer>, Integer> sumNumbers = numbersList -> {
          int sum = 0;
          for (Integer num : numbersList) {
              sum += num;
          }
          return sum;
        };

        System.out.println("Count = " + numbersCount);
        System.out.println("Sum = " + sumNumbers.apply(numbers));
    }
}
