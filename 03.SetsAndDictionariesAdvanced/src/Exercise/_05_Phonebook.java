package Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];
            phonebook.put(name, number);

            input = sc.nextLine();
        }

        String searchName = sc.nextLine();
        while (!searchName.equals("stop")) {
            if (phonebook.containsKey(searchName)) {
                System.out.printf("%s -> %s%n", searchName, phonebook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }

            searchName = sc.nextLine();
        }
    }
}
