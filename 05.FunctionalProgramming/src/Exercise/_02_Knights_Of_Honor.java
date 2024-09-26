package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02_Knights_Of_Honor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consumer<String> appendSir = string ->
                System.out.println("Sir " + string);

        Arrays.stream(sc.nextLine().split("\\s+"))
                .forEach(appendSir);
    }
}
