package Lab;

import java.util.*;

public class _07_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, List<String>>> earth = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!earth.containsKey(continent)) {
                earth.put(continent, new LinkedHashMap<>());
                earth.get(continent).put(country, new ArrayList<>());
            } else {
                if (!earth.get(continent).containsKey(country)) {
                    earth.get(continent).put(country, new ArrayList<>());
                }
            }
            earth.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : earth.entrySet()) {
            System.out.println(entry.getKey() + ":");

            for (Map.Entry<String, List<String>> innerEntry : entry.getValue().entrySet()) {
                System.out.println(" " + innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));
            }
        }
    }
}
