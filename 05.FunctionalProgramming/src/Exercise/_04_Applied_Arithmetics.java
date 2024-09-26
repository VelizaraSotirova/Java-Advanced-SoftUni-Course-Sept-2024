package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class _04_Applied_Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers  = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        //Add function ( +1 )
        Function<List<Integer>, List<Integer>> add = list ->
                list.stream()
                        .map(n -> n + 1)
                        .toList();

        //Multiply by 2
        Function<List<Integer>, List<Integer>> multiply = list ->
                list.stream()
                        .map(n -> n * 2)
                        .toList();

        //Subtract function ( -1 )
        Function<List<Integer>, List<Integer>> subtract = list ->
                list.stream()
                        .map(n -> n - 1)
                        .toList();

        //Print function
        Consumer<List<Integer>> print = list -> list.forEach(n -> System.out.print(n + " "));

        String command = sc.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add" -> numbers = add.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "print" -> {
                    print.accept(numbers);
                    System.out.println();
                }
            }

            command = sc.nextLine();
        }
    }
}
