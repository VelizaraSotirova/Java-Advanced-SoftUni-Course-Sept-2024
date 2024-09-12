package Lab;

import java.util.*;

public class _07_Math_Potato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kidsNames = sc.nextLine().split("\\s+");
        PriorityQueue<String> kids = new PriorityQueue<>();

        Collections.addAll(kids, kidsNames);

        int n = Integer.parseInt(sc.nextLine());
        int rotations = 1;
        while (kids.size() > 1) {
            for (int i = 0; i < n; i++) {
                kids.offer(Objects.requireNonNull(kids.poll()));
            }
            if (isPrime(rotations)) {
                System.out.println("Prime " + kids.peek());
            } else {
                System.out.println("Removed " + kids.poll());
            }
            rotations++;
        }
        System.out.println("Last is " + kids.poll());
    }


    private static boolean isPrime (int rotations) {
        boolean isPrime = true;
        for (int i = 2; i <= rotations - 1; i++) {
            if (rotations % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (rotations == 1) {
            return false;
        }
        return isPrime;
    }
}
