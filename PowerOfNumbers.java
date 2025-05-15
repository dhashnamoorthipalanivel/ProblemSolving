package ProblemSolving;

// Given a number n, find the value of n raised to the power of its own reverse.

// Note: The result will always fit into a 32-bit signed integer.

public class PowerOfNumbers {
    public int reverseExponentiation(int n) {
        // code here
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        double result = Math.pow(original, reverse);
        return (int) result;
    }
}
