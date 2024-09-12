package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = tokens[0]; //the number of elements to push into the stack
        int s = tokens[1]; //the number of elements to pop from the stack
        int x = tokens[2]; //an element that you should check whether is present in the stack

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(numbersStack::push);

        for (int i = 0; i < s; i++) {
            numbersStack.pop();
        }

        if (numbersStack.isEmpty()) {
            System.out.println(0);
        } else if (numbersStack.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numbersStack));
        }
    }
}
