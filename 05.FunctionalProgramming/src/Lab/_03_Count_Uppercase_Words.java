package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _03_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<String> startWithUpperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> words = Arrays.stream(sc.nextLine().split("\\s+")).filter(startWithUpperCase).toList();

        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
