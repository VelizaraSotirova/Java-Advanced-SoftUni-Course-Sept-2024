package Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _06_Fix_Emails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> emailDictionary = new LinkedHashMap<>();

        String name;
        while(!((name = sc.nextLine()).equals("stop"))) {
            String email = sc.nextLine();
            if (email.toLowerCase().endsWith("com") || email.toLowerCase().endsWith("uk") || email.toLowerCase().endsWith("us")) {
                continue;
            }
            emailDictionary.put(name, email);
        }

        emailDictionary.forEach((key, value) ->
                System.out.printf("%s -> %s%n", key, value));
    }
}
