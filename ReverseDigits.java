package ProblemSolving;

// You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

public class ReverseDigits {
    public int reverseDigits(int n) {
        // Code here
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
