package Lab;

import java.util.*;

public class _08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Double[]> graduationList = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Double[] scores = Arrays.stream(sc.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            graduationList.put(name, scores);
        }

        for (Map.Entry<String, Double[]> entry : graduationList.entrySet()) {
            String name = entry.getKey();
            Double[] grades = entry.getValue();

            System.out.printf("%s is graduated with %s%n", name, getAverageScore(grades));
        }
    }

    private static Double getAverageScore(Double[] values) {
        double average = 0.0;
        for (Double value : values) {
            average += value;
        }
        return average / values.length;
    }
}
