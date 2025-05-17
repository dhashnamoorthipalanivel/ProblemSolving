package ProblemSolving;
// You are given an integer n. Your task is to determine whether it is a palindrome.

// A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".

public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        // Code here
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
