package Exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class _04_Count_Symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TreeMap<Character, Integer> dictionary = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            dictionary.putIfAbsent(currentChar, 0);
            dictionary.put(currentChar, dictionary.get(currentChar) + 1);
        }

        dictionary.forEach((key, value) ->
                System.out.printf("%c: %d time/s\n", key, value));
    }
}
