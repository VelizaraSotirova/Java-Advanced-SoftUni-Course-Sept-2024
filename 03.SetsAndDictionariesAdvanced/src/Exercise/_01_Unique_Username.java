package Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_Unique_Username {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> uniqueUsername = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            uniqueUsername.add(line);
        }

        for (String username : uniqueUsername) {
            System.out.println(username);
        }
    }
}
