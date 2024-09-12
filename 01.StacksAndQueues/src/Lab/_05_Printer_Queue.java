package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_Printer_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = sc.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }

            input = sc.nextLine();
        }

        for (var filename : queue) {
            System.out.println(filename);
        }
    }
}
