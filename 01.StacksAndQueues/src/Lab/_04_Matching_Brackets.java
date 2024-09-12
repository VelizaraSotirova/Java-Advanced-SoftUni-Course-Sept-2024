package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _04_Matching_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        String expression = sc.nextLine();

        for (int index = 0; index < expression.length(); index++) {
            if (expression.charAt(index) == '(') {
                indexes.push(index);
            } else if (expression.charAt(index) == ')') {
                int startIndex = indexes.pop();
                String substring = expression.substring(startIndex, index + 1);
                System.out.println(substring);
            }
        }
    }
}
