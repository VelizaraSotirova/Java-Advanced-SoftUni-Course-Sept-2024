package Exercise;

import java.util.*;

public class _07_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Map<PlayerName, SetOfCards>
        LinkedHashMap<String, Set<String>> players = new LinkedHashMap<>();

        String line = sc.nextLine();
        while (!line.equals("JOKER")) {
            String[] tokens = line.split(": ");
            String playerName = tokens[0];
            String[] cards = tokens[1].split(", ");

            players.putIfAbsent(playerName, new HashSet<>());
            for (String card : cards) {
                players.get(playerName).add(card);
            }

            line = sc.nextLine();
        }

        players.forEach((key, value) -> {
            int points = calculatePoints(value);
            System.out.printf("%s: %d%n", key, points);
        });
    }

    private static int calculatePoints(Set<String> cards) {
        // Types : S -> 4, H-> 3, D -> 2, C -> 1
        // Power :  J to A is 11 to 14
        Map<String,Integer> powerMap = new HashMap<>(Map.of("2", 2,
                "3", 3,
                "4", 4,
                "5", 5,
                "6", 6,
                "7", 7,
                "8", 8,
                "9", 9,
                "10", 10
        ));
        powerMap.put("J", 11);
        powerMap.put("Q", 12);
        powerMap.put("K", 13);
        powerMap.put("A", 14);

        Map<String,Integer> typeMap = Map.of(
                "C", 1,
                "D", 2,
                "H", 3,
                "S", 4
        );

        int points = 0;

        for (String card : cards) {
            String cardPower = card.substring(0, card.length() - 1);
            String type = String.valueOf(card.charAt(card.length() - 1));

            Integer power = powerMap.get(cardPower);
            Integer typePower = typeMap.get(type);

            points += power * typePower;
        }

        return points;
    }
}
