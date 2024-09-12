package Exercise;

import java.util.*;

public class _03_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsCount = Integer.parseInt(sc.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commandsCount; i++) {
            int[] commands = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (commands[0]) {
                case 1-> stack.push(commands[1]);
                case 2 -> stack.pop();
                case 3 -> System.out.println(Collections.max(stack));
            }
        }
    }
}
