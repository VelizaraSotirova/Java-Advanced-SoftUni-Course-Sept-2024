package Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _05_Filter_by_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        // Create a map with people's name and age
        Map<String, Integer> people = new LinkedHashMap<>();

        //Fill the map
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(", ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            people.put(name, age);
        }

        //Read the next inputs from the console
        String condition = sc.nextLine();
        int ageLimit = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        //Create a predicate to filter the people by age
        Predicate<Integer> agePredicate;

        if (condition.equals("younger")) {
            agePredicate = personAge -> personAge <= ageLimit;
        } else {
            agePredicate = personAge -> personAge >= ageLimit;
        }

        //Create a consumer to print the info with
        Consumer<Map.Entry<String, Integer>> print;

        if (format.equals("name")) {
            print = entry -> System.out.println(entry.getKey());
        } else if (format.equals("age")) {
            print = entry -> System.out.println(entry.getValue());
        } else {
            print = entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }

        people.entrySet()
                .stream()
                .filter(entry -> agePredicate.test(entry.getValue()))
                .forEach(print);
    }
}
