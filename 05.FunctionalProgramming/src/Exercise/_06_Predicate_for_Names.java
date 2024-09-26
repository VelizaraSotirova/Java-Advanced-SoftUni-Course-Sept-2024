package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _06_Predicate_for_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reading the input
        int length = Integer.parseInt(sc.nextLine());
        String[] names = sc.nextLine().split("\\s+");

        //Create a predicate to filter the names with given length
        Predicate<String> filterNamesByLength = name -> name.length() <= length;
        Consumer<String> print = System.out::println;

        Arrays.stream(names)
                .filter(filterNamesByLength)
                .forEach(print);
    }
}
