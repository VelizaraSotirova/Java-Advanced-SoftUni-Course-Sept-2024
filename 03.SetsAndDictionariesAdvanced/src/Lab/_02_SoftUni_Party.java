package Lab;

import java.util.*;

public class _02_SoftUni_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> regularGuests = new TreeSet<>();
        Set<String> vipGuests = new TreeSet<>();

        String input = sc.nextLine();
        while (!input.equals("PARTY")) {
            char firstSymbol = input.charAt(0);

            if (Character.isDigit(firstSymbol)) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }

            input = sc.nextLine();
        }

        input = sc.nextLine();
        while (!input.equals("END")) {
            regularGuests.remove(input);
            vipGuests.remove(input);

            input = sc.nextLine();
        }

        System.out.println(regularGuests.size() + vipGuests.size());
        for (String vip : vipGuests) {
            System.out.println(vip);
        }
        for (String regular : regularGuests) {
            System.out.println(regular);
        }
    }
}
