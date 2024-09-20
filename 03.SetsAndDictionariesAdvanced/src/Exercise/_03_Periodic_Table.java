package Exercise;

import java.util.*;

public class _03_Periodic_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        while (n-- > 0) {
            String[] input = sc.nextLine().split("\\s+");
            periodicTable.addAll(Arrays.asList(input));
        }

        System.out.println(String.join(" ", periodicTable));
    }
}
