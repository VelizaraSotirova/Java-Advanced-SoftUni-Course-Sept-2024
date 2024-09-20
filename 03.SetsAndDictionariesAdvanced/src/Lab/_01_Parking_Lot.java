package Lab;

import java.util.*;

public class _01_Parking_Lot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> carNumbers = new LinkedHashSet<>();

        String input = sc.nextLine();
        while(!input.equals("END")) {
            String[] tokens = input.split(", ");
            if (tokens[0].equals("IN")) {
                carNumbers.add(tokens[1]);
            } else {
                carNumbers.remove(tokens[1]);
            }

            input = sc.nextLine();
        }

        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }
}
