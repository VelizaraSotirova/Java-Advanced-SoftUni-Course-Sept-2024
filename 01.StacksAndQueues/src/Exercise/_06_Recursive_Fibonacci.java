package Exercise;

import java.util.Scanner;

public class _06_Recursive_Fibonacci {

    private static long[] memory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        memory = new long[n + 1];
        long result = fib(n);
        System.out.println(result);
    }

    private static long fib(int n) {
        //fib(0) = 0; fib(1) = 1; fib(2) = 1;
        if (n < 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = fib(n - 1) + fib(n - 2);
        return memory[n];
    }
}
