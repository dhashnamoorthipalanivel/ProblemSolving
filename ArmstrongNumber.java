package ProblemSolving;
// You are given a 3-digit number n, Find whether it is an Armstrong number or not.

// An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

public class ArmstrongNumber {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int num = n;
        int count = 0;
        int sum = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num /= 10;
        }
        if (original == sum) {
            return true;
        } else {
            return false;
        }
    }
}
