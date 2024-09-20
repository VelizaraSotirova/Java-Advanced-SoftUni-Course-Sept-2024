package Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(n -> System.out.print(n + " "));
    }
}
