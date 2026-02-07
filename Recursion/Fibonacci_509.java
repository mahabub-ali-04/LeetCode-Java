package Recursion;

public class Fibonacci_509 {
    public static int fibpnacci(int n) {
        // corner case
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int prev1 = 0; // f(0)
        int prev2 = 1;// f(1)
        int curr = 0;// f(n)
        // loop
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(fibpnacci(n));
    }

}
