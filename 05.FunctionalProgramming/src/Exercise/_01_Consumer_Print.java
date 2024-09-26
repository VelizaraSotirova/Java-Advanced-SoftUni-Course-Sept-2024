package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_Consumer_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Consumer<String> print = System.out::println;

        Arrays.stream(sc.nextLine().split("\\s+"))
                .forEach(print);
    }
}
