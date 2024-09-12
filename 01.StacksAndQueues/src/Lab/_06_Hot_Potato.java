package Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _06_Hot_Potato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kidsNames = sc.nextLine().split("\\s+");
        ArrayDeque<String> kids = new ArrayDeque<>();

        Collections.addAll(kids, kidsNames);

        int n = Integer.parseInt(sc.nextLine());
        int rotations = 0;
        while (kids.size() > 1) {
            String kidToMove = kids.poll();
            rotations++;
            if(rotations % n == 0) {
                System.out.println("Removed " + kidToMove);
            } else {
                kids.offer(kidToMove);
            }
        }
        System.out.println("Last is " + kids.poll());
    }
}
