package DynamicProgramming;

public class Tribonacci_1137 {
    public static int tribonacci(int n) {
        // corner cases
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2 + prev3;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = curr;

        }
        return prev3;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(tribonacci(n));

    }

}
