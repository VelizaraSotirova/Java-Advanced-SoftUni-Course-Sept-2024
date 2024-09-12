package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> brackets = Arrays.stream(sc.nextLine().split(""))
                .toList();

        String result = isBalanced(brackets) ? "YES" : "NO";
        System.out.println(result);
    }

    private static boolean isBalanced(List<String> brackets) {
        ArrayDeque<String> openBracketsStack = new ArrayDeque<>();

        for (String bracket : brackets) {
            switch (bracket) {
                case "}" -> {
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!openBracketsStack.pop().equals("{")) {
                        return false;
                    }
                }
                case "]" -> {
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!openBracketsStack.pop().equals("[")) {
                        return false;
                    }
                }
                case ")" -> {
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!openBracketsStack.pop().equals("(")) {
                        return false;
                    }
                }
                default -> openBracketsStack.push(bracket);
            }
        }

        return openBracketsStack.isEmpty();
    }
}
