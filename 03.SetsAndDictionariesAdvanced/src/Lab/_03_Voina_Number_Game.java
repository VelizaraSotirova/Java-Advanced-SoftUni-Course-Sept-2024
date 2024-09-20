package Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _03_Voina_Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(firstPlayerCards::add);

        Set<Integer> secondPlayerCards = new LinkedHashSet<>();
        Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(secondPlayerCards::add);

        int rounds = 50;
        while (rounds > 0 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            Integer firstPlayerCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstPlayerCard);

            Integer secondPlayerCard = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }

            rounds--;
        }

        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
