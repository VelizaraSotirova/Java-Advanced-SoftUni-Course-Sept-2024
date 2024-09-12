package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_Browser_History {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while(!input.equals("Home")) {
            if (input.equals("back")) {
                if (browserHistory.size() > 1)  {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                browserHistory.push(input);
                System.out.println(input);
            }

            input = sc.nextLine();
        }
    }
}
