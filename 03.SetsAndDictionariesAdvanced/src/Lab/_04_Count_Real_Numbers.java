package Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] values = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numberOccurrences = new LinkedHashMap<>();
        for (double value : values) {
            if (!numberOccurrences.containsKey(value)) {
                numberOccurrences.put(value, 1);
            } else {
                numberOccurrences.put(value, numberOccurrences.get(value) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
