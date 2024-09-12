package Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] tokens = sc.nextLine().split(" ");
        int result = 0;

        Collections.addAll(stack, tokens);
        while (stack.size() > 1) {
            Integer a = Integer.valueOf(stack.pop());
            String operator = stack.pop();
            Integer b = Integer.valueOf(stack.pop());

            if (operator.equals("+")) {
                result = a + b;
            } else if (operator.equals("-")) {
                result = a - b;
            }
            stack.push(String.valueOf(result));
        }

        System.out.println(stack.pop());
    }
}
