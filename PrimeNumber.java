package ProblemSolving;
// Given a number n, determine whether it is a prime number or not.

// A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

public class PrimeNumber {

    static boolean isPrime(int n) {
        // code here
        int count = 0;
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
