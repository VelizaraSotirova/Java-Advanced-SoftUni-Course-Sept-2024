package Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _02_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = size[0];
        int secondSetSize = size[1];
        int totalSize = firstSetSize + secondSetSize;

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < totalSize; i++) {
            if (i < firstSetSize) {
                firstSet.add(scanner.nextLine());
            } else {
                secondSet.add(scanner.nextLine());
            }
        }

        //removes all the elements for the first set that does not contain in second set
        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
