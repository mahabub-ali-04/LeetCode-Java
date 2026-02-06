package Math;

public class PalindromeNumber_9 {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            int lastdigit = temp % 10;
            reverse = reverse * 10 + lastdigit;
            temp = temp / 10;
        }
        return n == reverse;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(10));
    }

}
