package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(number -> number % 2 == 0) //get the even numbers only in the list
                .collect(Collectors.toList()); //the numbers list will be mutable this way

        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));
    }
}
